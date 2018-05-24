package com.fesine.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
public class DataProviderTest {

    @DataProvider(name="user")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",18},
                {"lisi",20},
                {"wangwu",38}
        };
        return o;
    }

    @Test(dataProvider = "user")
    public void getUser(String name,int age){
        System.out.println("name="+name+"\t age="+age);
    }

    /**
     * 根据方法判断参数赋值
     */
    @DataProvider(name="userByMethod")
    public Object[][] dataProviderByMethod(Method method){
        Object[][] o = null;
        if(method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan", 18},
                    {"lisi", 20}
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"zhaoliu", 56},
                    {"wangwu", 38}
            };
        }
        return o;
    }

    @Test(dataProvider = "userByMethod")
    public void test1(String name,int age){
        System.out.println("name=" + name + "\t age=" + age);
    }

    @Test(dataProvider = "userByMethod")
    public void test2(String name,int age){
        System.out.println("name=" + name + "\t age=" + age);
    }
}
