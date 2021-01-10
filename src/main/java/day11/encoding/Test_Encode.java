package day11.encoding;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 9:03 下午
 * 测试编码转换
 */

public class Test_Encode {

    public static void main(String[] args) {
        // 写出的编码转换流,OutputStreamWriter把字节流转换成字符流
        try {
            // 1.创建OutputStreamWriter对象
            // 使用默认的编码方式
            // OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/main/java/day11/encoding/1.txt"));
            OutputStreamWriter out =
                new OutputStreamWriter(new FileOutputStream("src/main/java/day11/encoding/1.txt"), "gbk");

            // 2.写出数据
            out.write("学习");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
