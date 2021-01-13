package com.github.gudian1618.cgb2011javabasic.day07.oop;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/10 8:06 下午
 * 继承式is a的关系,子类必须是父类的一种继承结构具体所有实现,依赖性非常强,耦合性强
 */

public class Test4 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Huahua h = new Huahua();
        h.eat();
        // System.out.println(h.sum);
    }

}

// java中只支持单继承

class Animal {
    public void eat() {
        System.out.println("吃啥都行");
    }
}

class Huahua extends Cat {
    // 继承具有传递性

}

// 子类必须是父类的
class Cat extends Animal {
    // 父类的私有成员,子类无法继承
    private int sum = 10;
    // 子类继承父类后,相当于把父类的功能进行了复制和继承
}
