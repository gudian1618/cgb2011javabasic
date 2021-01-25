package com.github.gudian1618.cgb2011javabasic.innerclass;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/25 7:49 下午
 * 内部类
 * 成员内部类:  类里方法外
 * 局部内部类:  类里方法里
 * 内部类可以当成外部类的一个特殊成员
 * 内部类可以使用外部类的所有资源
 * 外部类如何使用内部类所有资源:  必须创建内部类对象,通过内部类对象来调用访问
 */

public class Test1_Inner {

    public static void main(String[] args) {
        // 创建内部类对象,使用内部类的资源
        // 外部类名.内部类 变量名 = 外部类对象.内部类对象
        Outer.Inner oi = new Outer().new Inner();
        oi.get();
        System.out.println(oi.count);

        Outer outer = new Outer();
        outer.save();
    }

}

class Outer {
    String name;
    private int age;

    public void save() {
        Inner in = new Inner();
        System.out.println(in.count);
        in.get();

        System.out.println("Outer...save()");
    }

    // 成员内部类
    class Inner {
        int count = 10;

        public void get() {
            System.out.println("Inner...get()");
            System.out.println(name);
            System.out.println(age);
            // 这里防止内外嵌套调用导致内存溢出异常,只做展示内部类随意调用外部类属性和方法
            // save();
        }
    }

}
