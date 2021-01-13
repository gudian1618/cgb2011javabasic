package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/13 9:26 下午
 */

public class Test2_Runnable {

    public static void main(String[] args) {
        // 创建线程对象
        MyRunnable target = new MyRunnable();

        // 如何把接口的实现类转成Thread类
        Thread thread = new Thread(target);
        thread.start();

        Thread thread1 = new Thread(target);
        thread1.start();
    }

}

class MyRunnable implements Runnable {
    // 把业务放入run()
    @Override
    public void run() {
        // 3.写业务
        for (int i = 0; i < 10; i++) {
            // Runnable接口中没有提供多余的方法,如何获取线程名称的方法,如何接口中用Thread类中的方法
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }
}
