package com.github.gudian1618.cgb2011javabasic.day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/10 9:29 下午
 */

public class Test8Design {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.run();
        b.stop();
        System.out.println(b.color);
        System.out.println(b.model);

        Audi a = new Audi();
        // 由于子类发生了重写,子类调用的是重写的方法
        a.run();
        a.stop();
        System.out.println(a.color);
        System.out.println(a.model);
    }

}

// 子类中共性内容提取到父类中
class Car {
    String color;
    int model;

    public void run() {
        System.out.println("run()");
    }

    public void stop() {
        System.out.println("stop()");
    }
}

class BMW extends Car{
    @Override
    public void run() {
        // super应用在子类中,表示父类对象的一个引用,相当于Car super = new Car();
        super.run();
        System.out.println("BMW...run()");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("BMW...stop()");
    }
}

class Audi extends Car{
    @Override
    public void run() {
        super.run();
        System.out.println("Audi..run()");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Audi..stop()");
    }
}
