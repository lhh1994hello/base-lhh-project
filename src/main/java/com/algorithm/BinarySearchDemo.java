package com.algorithm;

/**
 * @Author: lhh
 * @Date: 2019/6/9 10:10
 * @Version 1.0
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        BinarySearchDemo binarySearch = new BinarySearchDemo();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int index = binarySearch.binarySearchTest(array, array.length, 10);
        System.out.println("索引：" + index);

    }

    /**
     * 二分查找法，查找target在数组中的索引，如果不存在，返回-1
     *
     * @param array
     * @param n
     * @param target
     * @return
     */
    public int binarySearchTest(int[] array, int n, int target) {
        int left = 0, right = n - 1;//在[left,right]范围内查找target
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == array[middle]) {
                return middle;
            }
            if (target > array[middle]) {
                left = middle + 1;
            }
            if (target < array[middle]) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
