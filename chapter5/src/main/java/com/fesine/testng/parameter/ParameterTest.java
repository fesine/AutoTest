package com.fesine.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @description: 带参数测试
 * @author: Fesine
 * @createTime:2018/5/19
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/19
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void test(String name,Integer age){
        System.out.println("name="+name+",age="+age);
    }
}
