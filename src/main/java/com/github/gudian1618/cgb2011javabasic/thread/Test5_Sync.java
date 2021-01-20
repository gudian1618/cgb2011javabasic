package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/20 7:03 下午
 * 测试多线程的同步锁:  牺牲效率的情况下,保证数据同步安全
 * 1.多线程中数据安全问题的前提: 多线程程序+有共享数据(成员变量)+多条语句操作共享数据
 * 2.同步锁的位置: 范围不能太大不能太小,从问题发生的位置开始
 * 3.锁对象的要求: 多线程之间必须是同一把锁,同步代码块的锁对象可以使任意对象
 * 4.方法里的代码都被同步,直接把方法同步
 */

public class Test5_Sync {
    public static void main(String[] args) {
        TicketsSyn target = new TicketsSyn();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class TicketsSyn implements Runnable {

    int tickets = 100;

    Object o = new Object();

    @Override
    synchronized public void run() {
        while (true) {
            // 同一时间,资源没人抢占,独占
            // 同步代码块
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                if (tickets <= 0) {
                    break;
                }
            }
        }

    }
}
