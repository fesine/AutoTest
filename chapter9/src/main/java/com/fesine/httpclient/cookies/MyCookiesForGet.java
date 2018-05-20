package com.fesine.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
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
public class MyCookiesForGet {

    private String url;
    private ResourceBundle bundle;
    private CookieStore cookieStore;

    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void test1() throws IOException {
        String result;
        //从配置文件中拼接测试的url
        String testUrl = url + bundle.getString("getCookies.uri");
        HttpGet get = new HttpGet(testUrl);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
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
    public void testGetWithCookies() throws IOException {
        String testUrl = url + bundle.getString("test.get.with.cookies.uri");
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        client.setCookieStore(this.cookieStore);
        HttpResponse response = client.execute(get);
        //获取状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);
        if (statusCode == 200) {
            //获取响应信息
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
