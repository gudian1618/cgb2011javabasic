package com.github.gudian1618.cgb2011javabasic.innerclass;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/25 8:07 下午
 * 怎么调用使用(私有)内部类的私有资源方法
 */

public class Test2_Inner2 {

    public static void main(String[] args) {
        // 这种只能调用内部类的公共方法
        // Outer2.Inner2 oi = new Outer2().new Inner2();
        // oi.eat();
        new Outer2().show();
    }

}

class Outer2 {

    // 提供公共的方法,来提供内部类的私有方法
    // 间接的,创建一个公共方法,调用内部类的方法
    public void show() {
        Inner2 in = new Inner2();
        in.eat();
    }

    // 成员内部类,如果被私有化
    private class Inner2 {
        public void eat() {
            System.out.println("Inner2...eat()");
        }
    }
}
