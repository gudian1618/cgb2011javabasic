package com.github.gudian1618.cgb2011javabasic.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/27 9:33 下午
 * Socket服务器端
 * 接收客户端的请求给客户端做出响应
 * 测试先启动服务端,后启动客户端,不然客户端无法连接抓取到数据
 */

public class Server {

    public static void main(String[] args) throws IOException {
        // 1.启动服务,在8000端口等待客户端连接
        ServerSocket server = new ServerSocket(8000);

        // 2.接收客户端的连接请求,并建立连接数据
        Socket socket = server.accept();

        // 3.获取到读取的数据流,接收客户端发来的数据
        InputStream in = socket.getInputStream();
        // 循环读取字节流
        for (int i = 0; i < 5; i++) {
            // 这样把字符转成数字编码
            // int c = in.read();
            // 小转大,强制转换
            char c = (char) in.read();
            System.out.print(c);

        }

        // 5.给客户端发送数据
        OutputStream out = socket.getOutputStream();
        out.write("world".getBytes());
        out.close();

        // 4.释放资源
        in.close();
        server.close();

    }

}
