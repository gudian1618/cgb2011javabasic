package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/16 1:06 下午
 * 测试多线程售票
 * 4个窗口卖100张票
 */

public class Test3_Ticket {

    public static void main(String[] args) {
        TicketThread t = new TicketThread();
        t.start();
        TicketThread t2 = new TicketThread();
        t2.start();
        TicketThread t3 = new TicketThread();
        t3.start();
    }
}

class TicketThread extends Thread {
    // 1.记录表的数量
    // 静态数据相当于共享,只被加载一次
    static int tickets = 100;

    // 2.业务卸载run()方法里
    @Override
    public void run() {
        while (true) {
            // 如果数据能够接受sleep的考验,才能说明没有安全隐患
            try {
                // 产生了重卖,同一张票卖给了多个人
                // 产生了超卖,超出了票数,甚至出现负数
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "=" + tickets--);
            if (tickets <= 0) {
                break;
            }
        }
    }
}
