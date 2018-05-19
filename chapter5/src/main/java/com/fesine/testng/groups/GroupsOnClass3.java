package com.fesine.testng.groups;

import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void test1(){
        System.out.println("执行GroupsOnClass3中test11111测试");
    }

    public void test2(){
        System.out.println("执行GroupsOnClass3中test22222测试");
    }

}
