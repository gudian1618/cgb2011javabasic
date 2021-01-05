package day11.out;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/5 10:04 下午
 * 测试字节输出流
 */

public class Test1_OutputStream {

    public static void main(String[] args) {
        // 使用普通的字节输出流对象输出数据
        method();
    }

    private static void method() {
        try {
            // 1.创建输出流对象
            // OutputStream是抽象类不能直接new
            // 多态对象子类,使用父类的方法
            OutputStream out = new FileOutputStream("src/main/java/day11/out");

            // 2.正式写出数据
            out.write(97);

            // 3.释放资源
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
