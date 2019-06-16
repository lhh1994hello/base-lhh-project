package com.algorithm.queue;

/**
 * @Author: lhh
 * @Date: 2019/6/16 19:56
 * @Version 1.0
 */
public interface MyQueue<E> {
    public int getSize();

    public boolean isEmpty();

    //入队
    public void enqueue(E e);

    //出队
    public E dequeue();

    //获得队首元素
    public E getFront();

}
