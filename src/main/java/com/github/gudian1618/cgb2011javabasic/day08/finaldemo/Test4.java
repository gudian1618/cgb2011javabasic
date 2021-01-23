package com.github.gudian1618.cgb2011javabasic.day08.finaldemo;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/14 8:10 下午
 * 测试final关键字
 */

public class Test4 {

    public static void main(String[] args) {
        Zi z = new Zi();
        // z.name = "rose";
        System.out.println(z.name);
        z.eat();
    }

}

/**
 * final可以修饰类,但是子类将无法继承这个final父类
 */
class Fu {
    // final可以修饰成员变量,值不能修改,相当于常量
    final String name = "jack";

    // final可以修饰成员方法,但是,子类将无法重写
    final public void eat() {
        System.out.println("Fu...eat()");
    }
}

class Zi extends Fu {
    // @Override
    // public void eat() {
    //     super.eat();
    //     System.out.println("Zi...eat()");
    // }
}
