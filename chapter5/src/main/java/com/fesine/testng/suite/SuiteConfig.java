package com.fesine.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件执行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite测试套件执行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test 运行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test 运行");
    }
}
