package com.algorithm.stack;

/**
 * @Author: lhh
 * @Date: 2019/6/16 16:23
 * @Version 1.0
 * 栈接口
 */
public interface MyStack<E> {
    //栈元素个数
    public int getSize();

    //是否为空
    public boolean isEmpty();

    //入栈
    public void push(E e);

    //出栈
    public E pop();

    //查看栈顶元素
    public E peek();

}
