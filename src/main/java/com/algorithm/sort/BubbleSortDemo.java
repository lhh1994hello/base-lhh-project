package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author lhh
 * @date 2019/6/14 16:56
 * @Description: 冒泡排序
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();
        int[] randomArray = bubbleSortDemo.getRandomArray();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("随机数组：" + Arrays.toString(randomArray));
        System.out.println("排序后：" + Arrays.toString(bubbleSortDemo.bubbleSort(array)));
    }


    //冒泡排序
    public int[] bubbleSort(int[] array) {
        boolean flag = true;//优化，当已经排好序后，就没必要再循环了
        int count = 0;//数据交换次数

        for (int i = 0; i < array.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                    count++;
                }
            }
        }
        System.out.println("执行次数：" + count);
        return array;
    }


    private int[] getRandomArray() {
//        int randomLength = (int) (Math.random() * 10) + 10;//数组长度
        int randomLength = 15;//数组长度
        int[] array = new int[randomLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 10;
        }
        return array;
    }
}
