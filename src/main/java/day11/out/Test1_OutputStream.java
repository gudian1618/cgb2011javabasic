package day11.out;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/5 10:04 下午
 * 测试字节输出流
 * Buffered的底层维护了一个byte[]数组,8192字节,可以减少与磁盘的交互次数,提高效率和速度,减少频繁的IO读写
 */

public class Test1_OutputStream {

    public static void main(String[] args) {
        // 使用普通的字节输出流对象输出数据
        method();
        // 使用高性能的字节输出流
        method2();
    }

    private static void method2() {
        OutputStream out = null;
        try {
            // 1.创建爱你输出对象
            out = new BufferedOutputStream(new FileOutputStream("src/main/java/day11/2.txt"));
            // 2.写出数据
            out.write(48);
            out.write(49);
            out.write(50);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 释放资源
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void method() {
        OutputStream out = null;
        try {
            // 1.创建输出流对象
            // OutputStream是抽象类不能直接new
            // 多态对象子类,使用父类的方法
            out = new FileOutputStream("src/main/java/day11/2.txt");
            // 2.正式写出数据
            out.write(97);
            out.write(98);
            out.write(99);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 能够保证代码一定会被执行
            try {
                // 3.释放资源
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
