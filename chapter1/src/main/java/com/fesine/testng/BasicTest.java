package com.fesine.testng;

import org.testng.annotations.*;

/**
 * @description: testng 基本应用
 * @author: Fesine
 * @createTime:2018/5/23
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/23
 */
public class BasicTest {

    @Test
    public void test1(){
        System.out.println("这是第一个testng测试案例");
    }

    @Test
    public void test2(){
        System.out.println("这是第二个testng测试案例");
    }


    @Test(groups = "mygroup")
    public void testGroup1(){
        System.out.println("这是第一个group testng测试案例");
    }

    @Test(groups = "mygroup")
    public void testGroup2(){
        System.out.println("这是第二个group testng测试案例");
    }


    /**
     * 每个执行方法之前执行一次
     */
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 我在测试方法执行之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 我在测试方法执行之后执行");
    }

    /**
     * 需要指定具体的group才生效
     * 一个分组内执行一次
     */
    @BeforeGroups(groups = "mygroup")
    public void beforeGroups(){
        System.out.println("beforeGroups 我在测试组执行之前执行");
    }

    @AfterGroups(groups = "mygroup")
    public void afterGroups(){
        System.out.println("afterGroups 我在测试组执行之后执行");
    }

    /**
     * 一个测试类内执行一次
     */
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass 我在测试类之前执行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass 我在测试类之后执行");
    }
}
