package com.github.gudian1618.cgb2011javabasic.day04;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 7:42 下午
 * 用来测试break和continue
 */

public class Test2 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        // 100次收入
        for (int i = 1; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input != 88) {
                continue;
            } else if (input == 88) {
                System.out.println("恭喜您,猜对了!");
                break;
            }
        }
    }

}
