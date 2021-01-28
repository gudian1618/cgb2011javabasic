package com.github.gudian1618.cgb2011javabasic.net;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/28 8:09 下午
 * 一行一行的读和写
 */

public class TestIO {

    public static void main(String[] args) {
        // 读取一行数据BufferedReader.readLine()
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/main/java/com/github/gudian1618/cgb2011javabasic/net/1.txt"));
            // 读取一行时,会读取特殊标记,换行符\n
            // String line = in.readLine();
            // 没有数据时,该方法返回null
            // System.out.println(line);

            String line;
            while ((line = in.readLine()) != null) {
                // 只要有数据就循环的读取,没有数据结束循环
                System.out.println(line);
            }

            // 3.释放资源
            in.close();

            // 一行一行写出
            PrintWriter out = new PrintWriter(new FileWriter("src/main/java/com/github/gudian1618/cgb2011javabasic/net/2.txt"));
            out.println("hello");
            out.println("java");
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
