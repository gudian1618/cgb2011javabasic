package com.github.gudian1618.cgb2011javabasic.innerclass;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/25 10:06 下午
 * 匿名内部类:  内部类没有名字
 * 匿名内部类通常结合匿名对象使用
 * 创建的对象只干一次活,创建匿名内部类
 * 创建后使用多次,创建普通类对象名调用多次
 */

public class Test5_Inner5 {
    public static void main(String[] args) {
        // 创建一个接口的实现类,需要创建爱你接口里的所有抽象方法
        // 匿名内部类,相当于创建了一个接口的匿名实现类
        new Inner5() {

            @Override
            public void save() {
                System.out.println("save()");
            }

            @Override
            public void get() {
                System.out.println("get()");
            }
        }.get();
        // 触发指定的方法,匿名类对象只能同时触发一个方法

        // 相当于创建抽象类的子类,需要重写所有抽象方法
        new Inner52() {

            @Override
            public void eat() {
                System.out.println("eat()");
            }
        }.eat();

        // 普通类的匿名对象,不强制重写
        new Inner53() {
            @Override
            public void game() {
                System.out.println("game...");
            }

            @Override
            public void code() {
                System.out.println("code...");
            }
        }.code();
    }

}

interface Inner5 {
    void save();

    void get();

}

abstract class Inner52 {
    abstract public void eat();

    public void play() {
        System.out.println("play()");
    }
}

class Inner53 {
    public void game() {
        System.out.println("game()");
    }

    public void code() {
        System.out.println("code()");
    }
}
