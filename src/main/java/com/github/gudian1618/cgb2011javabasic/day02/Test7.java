package com.github.gudian1618.cgb2011javabasic.day02;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/28 12:30 下午
 */

public class Test7 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();

            String desc = "平年";
            // if (year % 4 == 0) {
            //     if (year%100 != 0) {
            //         // 修改默认值
            //         desc = "闰年";
            //     }
            // }
            // // 能被400整除
            // if (year%400==0) {
            //     desc = "闰年";
            // }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                desc = "闰年";
            }
            System.out.println(year + "年是" + desc);
        }
    }

}
