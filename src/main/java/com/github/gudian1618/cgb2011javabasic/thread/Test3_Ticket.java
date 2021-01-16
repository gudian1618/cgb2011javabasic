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
    }

}

class TicketThread extends Thread {
    // 1.记录表的数量
    int tickets = 100;

    // 2.业务卸载run()方法里
    @Override
    public void run() {
        while (true) {
            System.out.println(tickets--);
            if (tickets <=0) {
                break;
            }
        }
    }
}
