package com.fesine.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/24
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/24
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void testParameter(String name,int age){
        System.out.println("name=" + name + "\t age=" + age);
    }
}
