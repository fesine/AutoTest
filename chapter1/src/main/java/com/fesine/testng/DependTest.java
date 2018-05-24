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
public class DependTest {

    @Test
    public void testTaoBaoLogin(){
        System.out.println("淘宝登录成功!");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"testTaoBaoLogin"})
    public void testPay(){
        System.out.println("支付宝支付成功!");
    }
}
