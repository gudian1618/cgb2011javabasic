package com.github.gudian1618.cgb2011javabasic.day09.design;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/17 8:17 下午
 * 程序设计
 * 生活中的事物抽象对象---java类
 * 特征---属性  行为---方法
 * 把所有共性的内容向上抽取,形成父类
 * 面向抽象编程
 * 面向接口编程
 * 类中包含抽象方法,这个类必须是抽象类
 */

public class Test6 {

    public static void main(String[] args) {

    }
}

abstract class Teacher {
    // 讲课
    public abstract void teach();

    // 备课
    public void ready() {
        System.out.println("正在备课");
    }
}

class CgbTeacher extends Teacher {
    // 需要修改父类功能时,重写子类方法

    @Override
    public void teach() {
        System.out.println("主打电商项目");
    }

    @Override
    public void ready() {
        System.out.println("主打电商项目备课");
    }
}

// 子类继承抽象类,需要重写父类的所有的抽象方法
class ActTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("讲课基础加强和框架加强");
    }

    @Override
    public void ready() {
        System.out.println("备课基础加强和框架加强");
    }
}


