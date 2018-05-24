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
public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void test(){
        System.out.println("异常测试");
        throw new RuntimeException();
    }
}
