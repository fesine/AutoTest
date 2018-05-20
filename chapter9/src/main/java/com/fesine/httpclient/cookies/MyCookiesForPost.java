package com.fesine.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
public class MyCookiesForPost {

    private String url;
    private ResourceBundle bundle;
    private CookieStore cookieStore;

    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }


    @Test
    public void testGetCookies() throws IOException {
        //从配置文件中拼接测试的url
        String testUrl = url + bundle.getString("getCookies.uri");
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        client.execute(get);
        //获取返回的cookie信息
        this.cookieStore = client.getCookieStore();
        List<Cookie> cookieList = cookieStore.getCookies();
        for (Cookie cookie : cookieList) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name="+name+";cookie value="+value);
        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testPostWithCookies() throws IOException {
        String testUrl = url + bundle.getString("test.post.with.cookies.uri");
        //创建Client对象
        DefaultHttpClient client = new DefaultHttpClient();
        //声明一个方法 post
        HttpPost post = new HttpPost(testUrl);
        //添加头部信息
        post.setHeader("content-type", "application/json");
        //添加参数
        JSONObject param = new JSONObject();
        param.put("name", "huhansan");
        param.put("age", "18");
        StringEntity entity = new StringEntity(param.toString(), "utf-8");
        post.setEntity(entity);
        String result;
        client.setCookieStore(this.cookieStore);
        HttpResponse response = client.execute(post);
        //获取状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);
        if (statusCode == 200) {
            //获取响应信息
            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
            //将string转成json
            JSONObject resultJson = new JSONObject(result);
            String success = (String) resultJson.get("huhansan");
            String status = (String) resultJson.get("status");
            Assert.assertEquals("success", success);
            Assert.assertEquals("1", status);

        }
    }
}
