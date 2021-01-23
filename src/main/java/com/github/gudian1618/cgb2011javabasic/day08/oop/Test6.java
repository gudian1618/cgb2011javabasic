package com.github.gudian1618.cgb2011javabasic.day08.oop;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/14 11:11 下午
 * 测试多态的使用
 * 1.多态中,成员变量用的是父类的
 * 2.多态中,成员方法使用的是父类提供的方法声明,子类提供的方法体
 * 3.多态中,静态资源使用的是父类的
 * 静态资源(方法,属性)不存在重写,属于类初始化一次性,只有普通方法存在重写
 */

public class Test6 {

    public static void main(String[] args) {
        Dog2 d = new Dog2();
        System.out.println(d.sum);

        // TODO 创建多态对象测试
        Animal2 a = new Dog2();
        // 编译看左边,能用的功能必须是父类提供的
        // 1.多态中,成员变量用的是父类的
        System.out.println(a.sum);
        // 2.多态中,成员方法使用的是父类提供的方法声明,子类提供的方法体
        a.eat();
        // 3.多态中,静态资源使用的是父类的
        // 静态资源不存在重写,属于类
        a.game();

    }

}

class Animal2 {

    int sum = 10;

    static public void game() {
        System.out.println("Animal2..game()");
    }

    public void eat() {
        System.out.println("吃啥都行");
    }
}

class Dog2 extends Animal2 {
    int sum = 20;

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
