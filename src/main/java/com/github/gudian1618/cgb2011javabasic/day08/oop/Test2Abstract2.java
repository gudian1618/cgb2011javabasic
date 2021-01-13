package com.github.gudian1618.cgb2011javabasic.day08.oop;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/15 9:45 下午
 * 抽象类的使用方法
 */

public class Test2Abstract2 {

    public static void main(String[] args) {
        Animal4 a = new Dog4();
        // 抽象类无法实例化
        // Animal4 a2 = new Animal4();
    }

}

abstract class Animal4 {
    // 1.抽象类中的构造方法: 可以存在,目的不是为了创建抽象对象本身,而是为了创建子类对象使用的
    // 如果抽象类父类没有无参构造或对应的有参构造,子类对应的构造方法无法super继承实现,导致子类无法实例化
    // 如果有有参构造,养成写出无参构造的好习惯

    public Animal4() {}

    public Animal4(int a) {
        System.out.println("Animal4...构造方法");
    }
}

class Dog4 extends Animal4 {
    // 无参构造默认存在
    public Dog4() {
        // 子类的无参构造方法里面隐藏着super(),不写默认有
        super(5);
        System.out.println("Dog4...构造方法");
    }
}
