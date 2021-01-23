package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/20 8:29 下午
 * 学习重点
 * 懒汉式单例模式: 本质就是延迟加载
 * 只提前声明,使用时创建,节省内存资源
 * 1.延迟加载的思想: 什么时候用,什么时候创建
 * 2.线程安全问题: 共享资源(成员变量)有并发的多线程数据隐患,加同步锁(锁方法或锁代码块)
 */

public class Test7_Single2 {
    public static void main(String[] args) {
        MySingleton my = MySingleton.getMy();
        MySingleton my2 = MySingleton.getMy();
        System.out.println(my == my2);
    }
}

class MySingleton {
    // 1.私有化构造方法
    private MySingleton() {
    }

    // 2.在类的内部只声明对象,不会提前创建对象,等什么时候调用的时候,再创建
    // 成员变量,就是共享资源
    private static MySingleton my;

    // 3.提供全局访问点
    // 问题:程序中有共享资源,有多条语句操作共享资源,存在多线程安全隐患
    // 解决方案: 同步锁, 加锁位置和锁对象是谁?
    // 如果方法里面的所有代码被同步,可以同步方法
    synchronized public static MySingleton getMy() {
        // 静态区域内不能使用this关键词,因为加载的先后顺序,静态资源优先于对象加载,加载不存在的对象,所以同步代码块不正确
        if (my == null) {
            my = new MySingleton();
        }
        return my;
    }

}
