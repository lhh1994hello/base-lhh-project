package com.algorithm.array;

import org.junit.Test;

public class ArrayDemoGenericTest {

    @Test
    public void add() {
        MyDynamicArray<Integer> arrayDemoGeneric = new MyDynamicArray<Integer>(3);
        for (int i = 0; i < 12; i++) {
            arrayDemoGeneric.add(i);
        }
        System.out.println(arrayDemoGeneric.toString());
        for (int i = 0; i < 10; i++) {
            arrayDemoGeneric.remove(0);
        }
        System.out.println("=======================================");
        System.out.println(arrayDemoGeneric.toString());

    }
}