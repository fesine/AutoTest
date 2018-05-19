package com.fesine.testng.multithread;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class MultThreadTest {

    @Test
    public void test1(){
        System.out.printf("Thread id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread id: %s%n",Thread.currentThread().getId());
    }

}
