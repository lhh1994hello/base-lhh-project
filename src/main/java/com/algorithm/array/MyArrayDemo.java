package com.algorithm.array;

/**
 * @Author: lhh
 * @Date: 2019/6/15 18:27
 * @Version 1.0
 * 不允许出现空元素，数据都是连续的
 */
public class MyArrayDemo {
    private int[] data;
    private int size;//元素的个数，它指向第一个没有元素的位置

    //构造函数，传入数组的容量capacity
    public MyArrayDemo(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //无参构造函数，默认容量为10
    public MyArrayDemo() {
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
    public void addLast(int e) {
        add(size, e);
    }

    //向数组的头部添加元素
    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int e) {
        add(size, e);
    }

    //向指定索引位子添加元素
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("向数组中添加元素时，数组已经满了!");
        }
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组索引下标越界!");
        }
        //挪动元素
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //获取index索引位置的元素
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get failed，索引下标异常!");
        }
        return data[index];
    }

    //更新指定索引位置的值
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引下标异常!");
        }
        data[index] = e;
    }

    //是否包含指定的元素
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e所在的索引，如果不存在该元素就返回-1
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //删除指定索引位置的元素，返回删除的元素
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引参数异常!");
        }
        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    //移除第一个元素
    public int removeFirst() {
        return remove(0);
    }

    //移除最后一个元素
    public int removeLast() {
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
