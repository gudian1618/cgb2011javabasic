package com.github.gudian1618.cgb2011javabasic.innerclass;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/25 8:39 下午
 * 成员内部类被static修饰
 * 静态内部类不常用,浪费内存资源
 * 静态资源访问,不需要创建对象,直接类名.后续
 */

public class Test3_Inner3 {
    public static void main(String[] args) {
        // 如何使用内部类的方法
        // Outer3.Inner3 oi = new Outer3().new Inner3();

        // 静态资源调用
        Outer3.Inner3 oi = new Outer3.Inner3();
        oi.show();

        // 匿名调用
        // new Outer3().new Inner3().show();

        new Outer3.Inner3().show();

        // 静态资源访问,不需要创建对象,直接类名.后续
        // java的链式调用
        Outer3.Inner3.show2();
    }

}

class Outer3 {
    // 内部类被static修饰
    static class Inner3 {
        public void show() {
            System.out.println("Inner3...show()");
        }
        static public void show2() {
            System.out.println("Inner3...show()");
        }
    }
}
