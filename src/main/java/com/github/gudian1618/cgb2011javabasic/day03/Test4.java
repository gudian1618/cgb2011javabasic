package com.github.gudian1618.cgb2011javabasic.day03;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 6:59 下午
 * 测试嵌套for循环
 */

public class Test4 {

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            for (int j = 1; j < 6; j++) {
                System.out.println(j);
            }
        }
        System.out.println("=======");
        // 外循环控制行,内循环控制列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            // 内循环后换行
            System.out.println();
        }
    }

}
