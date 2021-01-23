package com.github.gudian1618.cgb2011javabasic.day08.oop;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/15 9:11 下午
 * 测试抽象类
 * 没有方法体的方法叫做抽象方法,用abstract修饰
 * 如果一个类中包含抽象方法,这个类就必须是抽象类
 * 子类继承了父类的抽象方法后,子类要把父类的抽象方法全部重写
 * 子类如果没有把父类的所有抽象方法都重写,子类仍然是一个抽象的子类
 * 抽象类不能被实例化
 * 抽象类中可以有普通方法
 */

public class TestAbstract {

    public static void main(String[] args) {
        // 创建多态对象测试

        // 父类引用 指向子类对象
        Animal3 a = new Dog3();
        // 子类重写,运行看右边,子类的功能
        a.eat();

        // Animal3 c = new Animal3();
    }

}

abstract class Animal3 {
    public abstract void eat();

    public void sleep() {

    }
}

// 子类继承了父类的抽象方法后,子类要把父类的抽象方法全部重写,变为普通的重写方法
class Dog3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

abstract class Cat extends Animal3 {

}
