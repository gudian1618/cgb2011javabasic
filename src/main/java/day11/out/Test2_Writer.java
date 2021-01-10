package day11.out;

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
    }

    private static void method() {
        Writer out = null;
        try {
            // 1.创建字符输出流对象 默认数据就是覆盖模式
            out = new FileWriter("src/main/java/day11/2.txt", true);
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
