package com.algorithm.queue;

/**
 * @Author: lhh
 * @Date: 2019/6/16 22:00
 * @Version 1.0
 * 循环队列
 */
public class MyLoopQueue<E> implements MyQueue<E> {
    private E[] data;
    private int front, tail;//头尾指针
    private int size;//元素个数

    public MyLoopQueue(int capacity) {
        //因为会浪费一个空间，所以设置的时候就多加一个，和期望的空间保持一致
        data = (E[]) new Object[capacity + 1];
    }

    public MyLoopQueue() {
        this(10);
    }

    //获取数组容量，要减1，有一个空间会被浪费
    public int getCapacity() {
        return data.length - 1;
    }


    @Override
    public int getSize() {
        return size;
    }

    //front和tail相等时，队列为空，(tail+1)%c=front时队列满
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    //入队
    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }

    }

    //扩容操作
    private void resize(int newCapacity) {
    }

    //出队
    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
