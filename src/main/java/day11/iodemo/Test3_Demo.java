package day11.iodemo;

import java.io.*;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 5:38 下午
 * 文件复制
 */

public class Test3_Demo {

    public static void main(String[] args) {
        // 开发思路:读取源文件,写出到目标文件中
        System.out.println("请输入源文件路径:");
        String f = new Scanner(System.in).nextLine();
        File from = new File(f);

        System.out.println("请输入目标文件路径:");
        String t = new Scanner(System.in).nextLine();
        File to = new File(t);

        copy(from, to);
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
