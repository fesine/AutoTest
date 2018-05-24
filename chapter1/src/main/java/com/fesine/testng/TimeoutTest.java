package com.fesine.testng;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
public class TimeoutTest {

    @Test(timeOut = 2000)
    public void testTimeout() throws InterruptedException {
        System.out.println("正在测试超时");
        Thread.sleep(3000);
    }
}
