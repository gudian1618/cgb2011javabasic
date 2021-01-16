package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/16 1:30 下午
 */

public class Test4_TIcket2 {

    public static void main(String[] args) {
        TicketRunnable target = new TicketRunnable();
        Thread thread = new Thread(target);
        thread.start();
        Thread thread2 = new Thread(target);
        thread2.start();
        Thread thread3 = new Thread(target);
        thread3.start();
    }

}

class TicketRunnable implements Runnable {
    int ticket = 100;

    // 把业务放入run方法
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    // 问题:超卖现象,重卖现象
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "=" + ticket--);
            }
            if (ticket <= 0) {
                break;
            }
        }
    }
}
