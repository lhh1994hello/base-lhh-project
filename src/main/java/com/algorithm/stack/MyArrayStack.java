package com.algorithm.stack;

import com.algorithm.array.MyDynamicArray;

/**
 * @Author: lhh
 * @Date: 2019/6/16 16:27
 * @Version 1.0
 */
public class MyArrayStack<E> implements MyStack<E> {
    private MyDynamicArray<E> arrayDemoGeneric;

    public MyArrayStack(int capacity) {
        arrayDemoGeneric = new MyDynamicArray<E>(capacity);
    }

    public MyArrayStack() {
        arrayDemoGeneric = new MyDynamicArray<E>();
    }

    @Override
    public int getSize() {
        return arrayDemoGeneric.getSize();
    }

    //是否为空
    @Override
    public boolean isEmpty() {
        return arrayDemoGeneric.isEmpty();
    }

    //入栈
    @Override
    public void push(E e) {
        arrayDemoGeneric.addLast(e);
    }

    //出栈
    @Override
    public E pop() {
        return arrayDemoGeneric.removeLast();
    }

    //查看栈顶元素
    @Override
    public E peek() {
        return arrayDemoGeneric.getLast();
    }

    public int getCapacity() {
        return arrayDemoGeneric.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack：");
        res.append("[");
        for (int i = 0; i < arrayDemoGeneric.getSize(); i++) {
            res.append(arrayDemoGeneric.get(i));
            if (i != arrayDemoGeneric.getSize() - 1) {
                res.append("，");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
