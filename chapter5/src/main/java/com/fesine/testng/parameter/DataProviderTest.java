package com.fesine.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void test(String name,int age){
        System.out.println("name="+name+";age="+age);
    }

    @DataProvider(name="data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "dataMethod")
    public void test1(String name,int age){
        System.out.println("test11111,name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "dataMethod")
    public void test2(String name,int age){
        System.out.println("test22222,name=" + name + ";age=" + age);
    }

    @DataProvider(name = "dataMethod")
    public Object[][] methodDataProvider(Method method) {
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan", 10},
                    {"lisi", 20}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu", 50},
                    {"zhaoliu", 60}
            };
        }
        return result;
    }

}
