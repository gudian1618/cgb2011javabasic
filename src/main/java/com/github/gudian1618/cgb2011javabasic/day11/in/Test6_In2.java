package com.github.gudian1618.cgb2011javabasic.day11.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/1 6:15 下午
 * 测试字符流读取
 */

public class Test6_In2 {
    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {
        try {
            // 1.创建对象,只有创建对象不一致
            // 实现高效的字符读取,底层维护了一个char[]数组,默认容量8*1024字节8K
            // 本质通过数组读效率高
            Reader in = new BufferedReader(new FileReader("src/main/java/com.github.gudian1618.cgb2011javabasic.collection.day11/m/1.txt"));
            // 2.开始读取
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }

            // 3.释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method() {
        try {
            // 1.创建对象,只有创建对象不一致
            Reader in = new FileReader("src/main/java/com.github.gudian1618.cgb2011javabasic.collection.day11/m/1.txt");
            // 2.开始读取
            // System.out.println(in.read());

            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }

            // 3.释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
