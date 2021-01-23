package com.github.gudian1618.cgb2011javabasic.day04;

import java.util.Random;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 7:49 下午
 */

public class Test3 {

    public static void main(String[] args) {
        // 1.让程序产生随机数
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        System.out.println(r);
        // 2.调用方法完成
        // method(r);

        method2(r);
    }

    public static void method2(int r) {
        do {
            // 1.接收用户输入的值
            int input = new Scanner(System.in).nextInt();
            // 2.判断和随机数的关系
            if (input > r) {
                System.out.println("大了");
            } else if (input < r) {
                System.out.println("小了");
            } else if (input == r) {
                System.out.println("相等");
                break;
            }
        } while (r > 50);
    }

    public static void method(int r) {
        // 死循环
        // 设置程序的出口
        while (true) {
            // 1.接收用户输入的值
            int input = new Scanner(System.in).nextInt();
            // 2.判断和随机数的关系
            if (input > r) {
                System.out.println("大了");
            } else if (input < r) {
                System.out.println("小了");
            } else if (input == r) {
                System.out.println("相等");
                break;
            }
        }
    }

}
