package com.github.gudian1618.cgb2011javabasic.innerclass;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/25 9:59 下午
 * 局部内部类
 */

public class Test4_Inner4 {

    public static void main(String[] args) {
        // 如何使用内部类资源
        new Outer4().show();
    }

}

class Outer4 {

    // 局部内部类:  内部类在外部类的方法里,  不常使用
    public void show() {
        class Inner4 {
            String name;
            int age;
            public void eat() {
                System.out.println("Inner4...eat()");
            }
        }
        // 想办法使用局部内部类的资源?  创建内部类对象才能使用对象
        Inner4 in = new Inner4();
        in.eat();
        System.out.println(in.name);
        System.out.println(in.age);
    }
}
