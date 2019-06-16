package com.algorithm.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: lhh
 * @Date: 2019/6/15 18:27
 * @Version 1.0
 * 泛型数组
 */
public class MyDynamicArray<E> {
    private static final Logger logger = LoggerFactory.getLogger(MyDynamicArray.class);
    private E[] data;
    private int size;//元素的个数，它指向第一个没有元素的位置

    //构造函数，传入数组的容量capacity
    public MyDynamicArray(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //无参构造函数，默认容量为10
    public MyDynamicArray() {
        this(10);
    }

    //元素个数
    public int getSize() {
        return size;
    }

    //数组容量
    public int getCapacity() {
        return data.length;
    }

    //数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向数组的末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }

    //向数组的头部添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    public void add(E e) {
        add(size, e);
    }

    //向指定索引位子添加元素
    public void add(int index, E e) {

        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组索引下标越界!");
        }
        if (size == data.length) {
            logger.info("数组满了，原数组容量是：{},扩容后容量是：{}", data.length, 2 * data.length);
            resize(2 * data.length);
        }
        //挪动元素
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //数组扩容
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    //获取index索引位置的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get failed，索引下标异常!");
        }
        return data[index];
    }

    //获取数组第一个元素
    public E getFirst() {
        return get(0);
    }

    //获取数组最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    //更新指定索引位置的值
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引下标异常!");
        }
        data[index] = e;
    }

    //是否包含指定的元素
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e所在的索引，如果不存在该元素就返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //删除指定索引位置的元素，返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引参数异常!");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;//释放size位置的引用，快速垃圾回收
        //减小数组容量
        if (size <= data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    //移除第一个元素
    public E removeFirst() {
        return remove(0);
    }

    //移除最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }


    //覆盖toString方法，打印数组内容
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array：size = %d，capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
