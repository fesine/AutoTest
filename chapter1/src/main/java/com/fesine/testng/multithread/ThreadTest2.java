package com.fesine.testng.multithread;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
@Test
public class ThreadTest2 {

    public void test1(){
        System.out.printf("ThreadTest2-test1 Thread id: %s%n",Thread.currentThread().getId());
    }

    public void test2(){
        System.out.printf("ThreadTest2-test2 Thread id: %s%n",Thread.currentThread().getId());
    }

    public void test3(){
        System.out.printf("ThreadTest2-test3 Thread id: %s%n",Thread.currentThread().getId());
    }
}
