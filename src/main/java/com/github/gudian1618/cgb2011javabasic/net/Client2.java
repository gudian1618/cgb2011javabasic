package com.github.gudian1618.cgb2011javabasic.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/27 9:33 下午
 * Socket的客户端
 * 1.指定要连接的服务器
 * 2.给服务器发送数据
 * 接收服务器发送来的数据,并对服务器做出响应
 */

public class Client2 {

    public static void main(String[] args) throws IOException {
        // 1.指定要联机的服务器,同时指定服务器的ip地址和端口号(一一对应)
        Socket socket = new Socket("127.0.0.1", 8000);

        // 2.获取到输出流,给服务器发送数据
        OutputStream out = socket.getOutputStream();
        // 字符串转换成字节数据byte[]进行写出
        out.write("hello".getBytes());
        // out.close();
        // 把数据不断刷新刷出去,而不关闭
        out.flush();

        // 4.读取从服务器发回来的数据流
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
            // 强转向上
            char b = (char) in.read();
            // 同行展示
            System.out.print(b);
        }

        // 3.释放资源
        socket.close();

    }
}
