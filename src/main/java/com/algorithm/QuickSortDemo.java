package com.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Author: lhh
 * @Date: 2019/6/9 20:58
 * @Version 1.0
 * 快速排序
 */
public class QuickSortDemo {
    private static final Logger logger = LoggerFactory.getLogger(QuickSortDemo.class);

    public static void main(String[] args) {
        int[] array = {7, 12, 6, 45, 3, 9, 11, 4, 16};
        System.out.println("排序前：" + Arrays.toString(array));
        QuickSortDemo quickSortDemo = new QuickSortDemo();
        quickSortDemo.quickSort(array, 0, array.length - 1);
        System.out.println("排序后：" + Arrays.toString(array));
    }

    /**
     * @param s
     * @param left
     * @param right 排序范围：[left,right]
     */
    private void quickSort(int[] s, int left, int right) {
        if (left > right) return;
        int i = left;
        int j = right;
        int base = s[left];//基准
        while (i < j) {
            //从后往前，找到比基准小的，将小的放前面
            while (i < j && s[j] > base) {
                j--;
            }
            //从前往后，找到比基准大的，将大的放后面
            while (i < j && s[i] <= base) {
                i++;
            }
            //交换
            if (i < j) {
                int temp = s[j];
                s[j] = s[i];
                s[i] = temp;
            }
            System.out.println("i:" + i + ",j:" + j + ",临时##：" + Arrays.toString(s));
        }
        //基准和最后的位置互换值,这一步交换使基准的值放在最终要放的位置
        int temp = s[i];
        s[i] = s[left];
        s[left] = temp;
        logger.info("基准:{},i:{}，排序结果：{}", base, i, Arrays.toString(s));
        quickSort(s, left, i - 1);
        quickSort(s, i + 1, right);
    }

}
