package com.fesine.testng;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
    }

}
