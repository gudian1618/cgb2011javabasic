package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/13 8:32 下午
 */

public class Test1_Thread {

    public static void main(String[] args) {
        // 1.创建Thread对象,新建状态
        MyThread t = new MyThread("jack");
        // run是普通方法的调用,单线程
        // t.run();
        // 启动线程,jvm自动调用run()方法的业务
        // 从新建状态转成可运行状态,就可以等待CPU调度运行
        // 该方法才能实现多线程
        t.start();
        MyThread t2 = new MyThread("rose");
        t2.start();
    }

}

// 1.自定义多线程类,继承Thread类
class MyThread extends Thread {
    // 自己的业务重写run()方法
    @Override
    public void run() {
        // 功能代码
        for (int i = 0; i < 10; i++) {
            // getName()获取正在执行任务的线程名称
            System.out.println(i + getName());
        }
    }

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

}
