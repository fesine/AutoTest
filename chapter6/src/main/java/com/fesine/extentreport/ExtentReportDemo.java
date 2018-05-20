package com.fesine.extentreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
public class ExtentReportDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals(2,2);
    }

    @Test
    public void testLogDemo(){
        Reporter.log("这是我自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }

}
