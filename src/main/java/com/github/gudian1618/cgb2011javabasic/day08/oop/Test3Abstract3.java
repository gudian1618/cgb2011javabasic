package com.github.gudian1618.cgb2011javabasic.day08.oop;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/15 10:01 下午
 * 抽象类中可以有成员变量和成员常量
 */

public class Test3Abstract3 {

    public static void main(String[] args) {
        Animal5 a = new Dog5();
        System.out.println(a.sum);
        System.out.println(a.name);
    }

}

abstract class Animal5 {
    // 抽象类中可以有成员变量
    int sum = 10;

    // 抽象类中可以有成员常量
    final String name = "jack";

    // 如果一个类都是普通方法,还是被声明为一个抽象类,原因是:如果不想让外界创建此类的实例,可以声明为抽象类
    public void eat() {
        System.out.println("吃啥都行");
    }

    public void sleep() {
        System.out.println("睡哪儿都行");
    }

    // 可以提供抽象方法
    public abstract void game();
}

class Dog5 extends Animal5 {

    // 当子类继承一个抽象父类时,必须实现重写父类抽象类中所有抽象方法,否则继承的子类必须是一个抽象类
    @Override
    public void game() {
        System.out.println("玩游戏");
    }
}
