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
public class IgnoreTest {

    @Test
    public void test1(){
        System.out.println("我是正常执行的测试");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("-----------");
    }
    @Test(enabled = true)
    public void test3(){
        System.out.println("---test3----");
    }

}
