package com.github.gudian1618.cgb2011javabasic.day04;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 8:20 下午
 * java中的普通数组,一旦创建,长度无法改变
 * 允许长度为0的数组
 */

public class Test4 {

    public static void main(String[] args) {
        // 静态创建
        char[] c = new char[]{'h','e','l','l','o'};
        char[] c2 = {'h','e','l','l','o'};

        // 动态创建
        char[] c3 = new char[5];

        c3[0] = 'h';
        c3[1] = 'e';
        c3[2] = 'l';
        c3[3] = 'l';
        c3[4] = 'o';
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c.length);

    }

}
