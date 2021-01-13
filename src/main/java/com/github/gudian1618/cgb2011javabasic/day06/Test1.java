package com.github.gudian1618.cgb2011javabasic.day06;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 8:23 下午
 */

public class Test1 {

    public static void main(String[] args) {

        Phone p = new Phone();
        p.call();
        p.message();
        p.music();

        System.out.println(p.price);
        System.out.println(p.color);
        System.out.println(p.size);
        System.out.println(p.model);

        System.out.println("===============");

        // 创建第二个同一个类对象
        Phone p2 = new Phone();

        // 给对象的属性赋值
        p2.color = "red";
        p2.size = "5.9";
        p2.model = "huawei";
        p2.price = 888;

        System.out.println(p2.price);
        System.out.println(p2.color);
        System.out.println(p2.size);
        System.out.println(p2.model);

    }

}

class Phone {
    String color;
    String size;
    String model;
    double price;

    public void call() {
        System.out.println("正在打电话");
    }

    public void message() {
        System.out.println("正在发送短信");
    }

    public void music() {
        System.out.println("正在听音乐");
    }
}
