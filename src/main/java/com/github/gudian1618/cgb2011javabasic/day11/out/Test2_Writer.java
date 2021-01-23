package com.github.gudian1618.cgb2011javabasic.day11.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 4:59 下午
 * 测试字符输出流
 */

public class Test2_Writer {

    public static void main(String[] args) {
        method();
        // 高效的字符流
        method2();
    }

    private static void method2() {
        BufferedWriter out = null;
        try {
            // 1.创建字符流
            out = new BufferedWriter(new FileWriter("src/main/java/com.github.gudian1618.cgb2011javabasic.collection.day11/2.txt", true));
            // 2.写出数据
            out.write(90);
            out.write(91);
            out.write(92);
            out.write("io");
            out.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        Writer out = null;
        try {
            // 1.创建字符输出流对象 默认数据就是覆盖模式
            out = new FileWriter("src/main/java/com.github.gudian1618.cgb2011javabasic.collection.day11/2.txt", true);
            // 2.写出数据
            out.write("100");
            out.write("hello");
            out.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.释放资源
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
