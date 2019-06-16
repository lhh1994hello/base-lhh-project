package com.algorithm.queue;

import com.algorithm.array.MyDynamicArray;

/**
 * @Author: lhh
 * @Date: 2019/6/16 19:59
 * @Version 1.0
 * 队列
 */
public class MyArrayQueue<E> implements MyQueue<E> {
    private MyDynamicArray<E> myDynamicArray;

    public MyArrayQueue(int capacity) {
        myDynamicArray = new MyDynamicArray<E>(capacity);
    }

    public MyArrayQueue() {
        myDynamicArray = new MyDynamicArray<E>();
    }

    //获取元素个数
    @Override
    public int getSize() {
        return myDynamicArray.getSize();
    }

    @Override
    public boolean isEmpty() {
        return myDynamicArray.isEmpty();
    }

    //获取去队列的容量
    public int getCapacity() {
        return myDynamicArray.getCapacity();
    }

    //入队
    @Override
    public void enqueue(E e) {
        myDynamicArray.addLast(e);
    }

    //出队
    @Override
    public E dequeue() {
        return myDynamicArray.removeFirst();
    }

    //获取队列头元素
    @Override
    public E getFront() {
        return myDynamicArray.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue front [");
        for (int i = 0; i < myDynamicArray.getSize(); i++) {
            res.append(myDynamicArray.get(i));
            if (i != myDynamicArray.getSize() - 1) {
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
