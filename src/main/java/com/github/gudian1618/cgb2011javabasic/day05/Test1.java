package com.github.gudian1618.cgb2011javabasic.day05;

import java.util.Arrays;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/1 8:05 下午
 */

public class Test1 {

    public static void main(String[] args) {
        // 1.创建无序数组
        int[] a = {21, 96, 75, 23, 35};

        // 2.调用method排序
        // int[] newA = method(a);
        // System.out.println(Arrays.toString(newA));

        // 底层使用的算法是:
        // 基本数据类型用的是优化后的快速排序
        // 引用数据类型使用的是优化后的合并排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }

    // 完成排序
    public static int[] method(int[] a) {
        // 1.外循环:控制比较轮数,假设n个数,需要比较n-1次
        for (int i = 0; i < a.length - 1; i++) {
            // 2.内循环: 相邻比较,交换位置
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }

}
