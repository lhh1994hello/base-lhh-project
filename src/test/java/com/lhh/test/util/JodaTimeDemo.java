package com.lhh.test.util;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * @author lhh
 * @date 2019/6/14 9:11
 * @Description: jodaTime测试
 */
public class JodaTimeDemo {

    @Test
    public void fun1() {
        DateTime today = new DateTime();
        DateTime datetorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));//2017-06-26
        System.out.println(today.toString("yyyy-MM-dd HH:mm:ss"));//2017-06-26 22:04:03
        System.out.println(datetorrow.toString("yyyy-MM-dd"));//2017-06-27

        System.out.println("......................");

        int a=0;
    }
}
