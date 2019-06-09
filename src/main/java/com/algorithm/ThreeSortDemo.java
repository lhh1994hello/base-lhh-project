package com.algorithm;

import org.springframework.util.Assert;

import java.util.Arrays;

/**
 * 排序，数组中只有0,1,2三种可能的取值，要求按0,1,2排序
 *
 * @Author: lhh
 * @Date: 2019/6/9 20:22
 * @Version 1.0
 */
public class ThreeSortDemo {

    public static void main(String[] args) {
        ThreeSortDemo threeSortDemo = new ThreeSortDemo();
        int[] nums = {1, 0, 2, 1, 2, 0, 2, 1, 0};
        int[] sortResult = threeSortDemo.threeSort(nums);
        System.out.println(Arrays.toString(sortResult));
    }

    /**
     * @param nums 这种排序中，数据的取值种类有限，
     */
    public int[] threeSort(int[] nums) {
        int zero = -1;//nums[0,zero]==0,
        int two = nums.length;//nums[two,n-1]=2
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                swapTwoIndexValue(nums, i, two);
            } else if (nums[i] == 0) {
                zero++;
                swapTwoIndexValue(nums, zero, i);
            }
        }
        return nums;
    }

    /**
     * 交换一个数组中两个索引的值
     *
     * @param nums
     * @param source
     * @param destination
     * @return
     */
    private int[] swapTwoIndexValue(int[] nums, int source, int destination) {
        int temp = 0;
        temp = nums[source];
        nums[source] = nums[destination];
        nums[destination] = temp;
        return nums;
    }

}
