package day11.in;

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
    }

    private static void method() {
        try {
            // 1.创建对象
            Reader in = new FileReader("src/main/java/day11/m/1.txt");
            // 2.开始读取
            System.out.println(in.read());
            // 3.释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
