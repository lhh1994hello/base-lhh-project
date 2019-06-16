package com.algorithm.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 测试自定义的队列类
 */
public class MyArrayQueueTest {

    /**
     * 测试入队，出队
     */
    @Test
    public void enqueue() {
        MyQueue<Integer> myQueue = new MyArrayQueue<Integer>();

        for (int i = 0; i < 10; i++) {
            myQueue.enqueue(i);
        }
        for (int i = 0; i < 5; i++) {
            myQueue.dequeue();
        }
        System.out.println(myQueue.toString());
    }
}