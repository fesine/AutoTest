package com.fesine.testng;

import org.testng.annotations.*;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
public class TestConfig {

    /**
     * 一个test内只执行一次
     */
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest 我在测试之前执行");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest 我在测试之后执行");
    }

    /**
     * 一个测试套件内只执行一次
     */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite 我在测试套件之前执行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite 我在测试套件之后执行");
    }
}
