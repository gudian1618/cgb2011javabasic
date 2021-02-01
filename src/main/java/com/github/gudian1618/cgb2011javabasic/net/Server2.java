package com.github.gudian1618.cgb2011javabasic.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/28 8:40 下午
 * 用作回声案例的服务器
 * 1.启动服务器
 * 2.接收客户端的连接请求
 * 3.给每个客户端分配对应的连接端
 * 4.连接并发端,主要负责和客户端沟通IO
 */

public class Server2 {

    // 创建方法,负责多端并发操作
    public void service() {

        // 主要负责和客户端沟通IO
        class HuaWuThread extends Thread {
            // 保持通话
            Socket socket;

            public HuaWuThread(Socket socket) {
                this.socket = socket;
            }

            // 把业务放入run方法,一直读取客户端发来的数据,并作出回声数据
            @Override
            public void run() {
                try {
                    // 读取一行BufferedReader,一行行的写PrintWriter
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

                    // 读取客户端发来的一行数据
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println("客户端发来的数据:" + line);
                        System.out.println("请您输入想要给客户端发送的数据:");
                        String input = new Scanner(System.in).nextLine();
                        // out.println(line);
                        out.println(input);
                        out.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 使用多线程开发,提高服务器的执行效率,提高吞吐量
        // 匿名内部类
        // 每个客户端之间不用等待和阻塞,可以并发访问
        new Thread() {
            // 把业务写入run()中
            @Override
            public void run() {
                try {
                    // 1.启动
                    ServerSocket server = new ServerSocket(8000);
                    System.out.println("服务器已经启动成功!");
                    // 2.一直接收所有客户端的连接请求
                    while (true) {
                        Socket socket = server.accept();
                        System.out.println("客户端连接成功!");
                        // 3.给每个客户端分配对应的处理响应
                        HuaWuThread t = new HuaWuThread(socket);
                        t.start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void main(String[] args) {
        Server2 s = new Server2();
        s.service();
    }

}
