package com.github.gudian1618.cgb2011javabasic.net;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/27 9:33 下午
 * 回声安利的客户端
 * 1.连接指定的服务器
 * 2.一直给服务器发送数据
 * 3.一直接收服务器回声的数据
 */

public class Client2 {

    public static void main(String[] args) {
        // 1.指定要联机的服务器,同时指定服务器的ip地址和端口号(一一对应)
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 8000);
            // 2.获取到输出流,给服务器发送数据
            while (true) {
                // 向服务器写出一行数据,并且读取服务器回声回来的一行数据
                PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 3. 一直发送一直接收
                System.out.println("请输入您要给服务器端发送的数据:");
                String input = new Scanner(System.in).nextLine();
                // 向服务器发送了指定的数据
                out.println(input);
                // 把数据持续的输出去不间断
                out.flush();

                // 读取回声数据
                String line = in.readLine();
                System.out.println("服务器的回声数据是:" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
