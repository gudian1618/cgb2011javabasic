package com.github.gudian1618.cgb2011javabasic.day02;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/25 9:19 下午
 */

public class Test4_Scope {

    public static void main(String[] args) {

        long aa = 99999999999L;
        float bb = 4.3F;
        double cc = 30.989d;

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 交换值
        int t = a;
        a = b;
        b = t;

        System.out.println(a);
        System.out.println(b);
    }

}
