package com.github.gudian1618.cgb2011javabasic.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/27 9:33 下午
 * Socket的客户端
 * 1.指定要连接的服务器
 * 2.给服务器发送数据
 */

public class Client {

    public static void main(String[] args) throws IOException {
        // 1.指定要联机的服务器,同时指定服务器的ip地址和端口号(一一对应)
        Socket socket = new Socket("127.0.0.1", 8000);

        // 2.获取到输出流,给服务器发送数据
        OutputStream out = socket.getOutputStream();
        // 字符串转换成字节数据byte[]进行写出
        out.write("hello".getBytes());
        out.close();

        // 3.释放资源
        socket.close();

    }
}
