package com.github.gudian1618.cgb2011javabasic.day09.design;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/17 8:42 下午
 * 抽取共性,形成抽象层,体现接口
 */

public class Test7 {

    public static void main(String[] args) {

    }

}

interface Teacher2 {

    void teach();

    void ready();
}

// 实现类需要使用接口的功能,需要发生实现关系
class CgbTeacher2 implements Teacher2 {

    @Override
    public void teach() {
        System.out.println("主打电商项目");
    }

    @Override
    public void ready() {
        System.out.println("备课电商项目");
    }

}

abstract class ActTeacher2 implements Teacher2{

}
