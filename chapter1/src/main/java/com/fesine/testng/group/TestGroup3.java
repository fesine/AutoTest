package com.fesine.testng.group;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
@Test(groups = "teacher")
public class TestGroup3 {

    public void test1(){
        System.out.println("------>在teacher分组中执行TestGroup3的test1方法");
    }

    public void test2(){
        System.out.println("------>在teacher分组中执行TestGroup3的test2方法");
    }
}
