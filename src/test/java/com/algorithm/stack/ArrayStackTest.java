package com.algorithm.stack;

import org.junit.Test;

/**
 * 栈测试类
 */
public class ArrayStackTest {

    @Test
    public void push() {
        MyStack<Integer> stack = new MyArrayStack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            stack.pop();
        }
        System.out.println(stack.toString());
    }
}