package com.fesine.testng;

import org.testng.annotations.Test;

/**
 * @description: 什么时候会用到异常测试？
 * 在我们期望结果为某一个异常的时候
 * 比如，我们传入某些不合法的参数，程序抛出的异常
 * 也就是说我的预期结果就是这个异常
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class ExceptedException {

    /**
     * 这是一个测试结果会失败的异常测试
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("这是一个会失败的异常测试");
    }

    /**
     * 这是一个测试结果会失败的异常测试
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
