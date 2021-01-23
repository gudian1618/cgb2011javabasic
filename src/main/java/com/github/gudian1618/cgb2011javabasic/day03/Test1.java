package com.github.gudian1618.cgb2011javabasic.day03;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 6:09 下午
 * 测试商品打折案例
 */

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 原价
        double price = scanner.nextDouble();
        // 折后价
        double count = price;
        if (price >= 5000) {
            count = price * 0.5;
        } else if (price >= 2000) {
            count = price * 0.8;
        } else if (price >= 1000) {
            count = price * 0.9;
        } else {
            count = price;
        }
        System.out.println("原价是"+price+",折扣价是"+count);

    }

}
