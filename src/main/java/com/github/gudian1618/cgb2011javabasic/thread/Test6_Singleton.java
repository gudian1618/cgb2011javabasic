package com.github.gudian1618.cgb2011javabasic.thread;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/20 8:18 下午
 * 设计单例模式
 * 饿汉式,主动,相对简单
 */

public class Test6_Singleton {

    public static void main(String[] args) {
        MySingle m = MySingle.getSingle();
        MySingle m2 = MySingle.getSingle();
        // 比较两个引用类型的变量,地址值相同,肯定是同一个对象
        System.out.println(m == m2);
    }

}

class MySingle {
    // 1.私有化构造方法,不让外界随意new创建对象
    private MySingle() {
    }

    // 2.在类的内部,提供一个已经创建好的对象
    // static静态是因为 静态资源getSingle()只能调用静态
    private static MySingle single = new MySingle();

    // 3.对外提供一个全局访问点,返回值类型为本类对象的变量类型
    // 对外提供静态方法,用于类名调用
    public static MySingle getSingle() {
        return single;
    }
}
