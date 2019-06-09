package com.algorithm;

import org.junit.Test;

/**
 * @Author: lhh
 * @Date: 2019/6/8 21:06
 * @Version 1.0
 */
public class TimeTest {
    @Test
    public void fun1() {
        for (int x = 1; x < 20; x++) {
            double n = Math.pow(10, x);
            long startTime = System.currentTimeMillis();
            System.out.println("x:" + x);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + i;
            }
            long endTime = System.currentTimeMillis();
            double totalTime = (endTime - startTime) / 1000.0;
            System.out.println("x=" + x + ",n=" + n + ",===>总时间：" + totalTime);
        }

        System.out.println("=====================================执行结束!");
    }
}
