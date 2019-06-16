package com.algorithm.array;

import org.junit.Test;

public class ArrayDemo1Test {

    @Test
    public void add() {
        MyArrayDemo array = new MyArrayDemo(20);
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        array.add(1, 100);
        System.out.println(array.toString());
        array.addFirst(-1);
        System.out.println(array.toString());
        array.remove(0);
        System.out.println(array.toString());
    }
}