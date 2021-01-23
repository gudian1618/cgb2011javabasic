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
        // 直接使用Thread的含参构造
        Thread thread = new Thread(target, "勃拉姆斯");
        thread.start();

        Thread thread1 = new Thread(target, "西贝柳斯");
        thread1.start();

        // start(多线程执行) 和 run(主程序创建一个普通的单线程顺序执行) 的区别

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
