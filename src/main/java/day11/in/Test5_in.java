package day11.in;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/1 5:14 下午
 * 测试文件的读取ß
 */

public class Test5_in {

    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {
        try {
            // 1.创建字节流的读取对象
            // BufferedInputStream提高效率地读取,原因底层维护了一个byte[]数组,默认容量8K,8*1024
            InputStream in2 = new BufferedInputStream(new FileInputStream("src/main/java/day11/m/1.txt"));
            // 2.开始读取
            // System.out.println(in2.read());
            // System.out.println(in2.read());

            // 重复读取每个字节
            int b;
            while ((b=in2.read()) != -1) {
                System.out.println(b);
            }

            // 3.释放资源
            in2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method() {
        try {
            // 1.创建字节流的读取对象
            // InputStream是字节读取流的父类,是抽象类不能new创建
            // 两种创建方式
            InputStream in = new FileInputStream(new File("src/main/java/day11/m/1.txt"));
            InputStream in2 = new FileInputStream("src/main/java/day11/m/1.txt");
            // 2.开始读取
            // System.out.println(in2.read());
            // System.out.println(in2.read());

            // 重复读取每个字节
            int b;
            while ((b=in2.read()) != -1) {
                System.out.println(b);
            }

            // 3.释放资源
            in2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
