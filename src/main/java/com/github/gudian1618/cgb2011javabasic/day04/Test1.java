package com.github.gudian1618.cgb2011javabasic.day04;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 7:34 下午
 */

public class Test1 {

    public static void main(String[] args) {
        method(10, 5);
        // 在类中存在多个同名方法,每个方法的参数列表不同,个数不同或类型不同
        method(10);
        method("jack", 10);
    }

    private static void method(int a) {
        System.out.println(a * a);
    }

    private static void method(int a, int b) {
        System.out.println(a + b);
    }

    private static void method(String a, int b) {
        System.out.println(a + b);
    }

}
