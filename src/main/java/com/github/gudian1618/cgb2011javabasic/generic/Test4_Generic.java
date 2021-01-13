package com.github.gudian1618.cgb2011javabasic.generic;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 9:39 下午
 * 泛型的好处
 */

public class Test4_Generic {

    public static void main(String[] args) {
        // 1.打印数组中的元素
        Integer[] a = {1, 2, 3, 4, 5, 6};
        String[] b = {"tony", "jack", "rose", "xiongda"};
        Double[] c = {1.1, 1.2, 1.3, 1.45, 1.45};
        print(a);
        print(b);
        print(c);
    }

    // 1.泛型可以实现通用代码,使用E表示元素的类型Element类型
    // 2.如果在方法上使用泛型,必须同时出现在,一个是参数位置前面即声明类型的位置,一个是返回值类型前面
    private static <E> void print(E[] x) {
        // 遍历循环iter
        // 好处是for循环效率高,语法简介
        // 坏处是无法具体每个下标来获取值
        for (E i : x) {
            System.out.println(i);
        }
    }

}
