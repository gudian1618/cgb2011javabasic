package com.github.gudian1618.cgb2011javabasic.day11.iodemo;

import java.io.*;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 6:05 下午
 * 批量读写操作
 */

public class Test4_Batch {
    public static void main(String[] args) {
        // 开发思路:读取源文件,写出到目标文件中
        System.out.println("请输入源文件路径:");
        String f = new Scanner(System.in).nextLine();
        File from = new File(f);

        System.out.println("请输入目标文件路径:");
        String t = new Scanner(System.in).nextLine();
        File to = new File(t);

        copy(from, to);
        copyZJ(from, to);
    }

    private static void copyZJ(File from, File to) {
        InputStream in = null;
        OutputStream out = null;
        try {
            // 1.读取from文件 -- 字节流
            in = new BufferedInputStream(new FileInputStream(from));
            // 2.写出到to文件
            out = new BufferedOutputStream(new FileOutputStream(to));

            // 边读边写
            // 定义变量,存读到的数据
            int b = 0;
            // 没有数据就返回-1
            // 使用批量读写使用read(byte[] bs)的重载形式,可以按照数组的方式去读
            // 建议向源码里面的初始化自定义看齐
            byte[] bs = new byte[8 * 1024];
            // 按照数组批量的方式去读
            while ((b = in.read(bs)) != -1) {
                out.write(bs);
            }
            System.out.println("文件复制完成!");
        } catch (IOException e) {
            System.out.println("文件复制失败!");
            e.printStackTrace();
        } finally {
            // 3.释放资源
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void copy(File from, File to) {
        Reader in = null;
        Writer out = null;
        try {
            // 1.读取from文件 -- 字符流
            in = new BufferedReader(new FileReader(from));
            // 2.写出到to文件
            out = new BufferedWriter(new FileWriter(to));

            // 边读边写
            // 定义变量,存读到的数据
            int b = 0;
            // 没有数据就返回-1
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("文件复制完成!");
        } catch (IOException e) {
            System.out.println("文件复制失败!");
            e.printStackTrace();
        } finally {
            // 3.释放资源
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
