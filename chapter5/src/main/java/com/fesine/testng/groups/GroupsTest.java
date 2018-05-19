package com.fesine.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class GroupsTest {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端运行测试11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端运行测试22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("服务端运行测试33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("服务端运行测试44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端分组运行之前执行。");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端分组运行之后执行1111。");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端分组运行之前执行。");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端分组运行之后执行1111。");
    }


}
