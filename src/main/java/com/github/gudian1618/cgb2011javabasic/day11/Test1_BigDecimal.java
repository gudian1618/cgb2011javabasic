package com.github.gudian1618.cgb2011javabasic.day11;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 6:18 下午
 */

public class Test1_BigDecimal {

    public static void main(String[] args) {
        // 暴露浮点数运算不精确的问题
        // method();
        // 使用工具类BigDecimal解决浮点数运算不精确的现象
        method2();
    }

    private static void method2() {
        // 1.接收用户输入的两个小数
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        // 创建工具类对象,最好不要用double作为参数的构造方法,有坑
        // 最好使用String参数的构造方法
        BigDecimal bd1 = new BigDecimal(a + "");
        BigDecimal bd2 = new BigDecimal(b + "");

        // 2.运算
        BigDecimal bd3;
        bd3 = bd1.add(bd2);
        System.out.println(bd3);

        bd3 = bd1.subtract(bd2);
        System.out.println(bd3);

        bd3 = bd1.multiply(bd2);
        System.out.println(bd3);

        // 当除法除不尽的时候,无法产生精确数据时,报异常抛出
        // bd3 = bd1.divide(bd2);
        bd3 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);
        System.out.println(bd3);

    }

    private static void method() {
        // 1.接收用户输入的两个小数
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        // 2.运算,都不精确,不是每次运算都不精确,随机的
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

}
