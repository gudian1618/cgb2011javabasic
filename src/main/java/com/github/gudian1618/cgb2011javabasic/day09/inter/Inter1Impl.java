package com.github.gudian1618.cgb2011javabasic.day09.inter;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/16 9:18 下午
 * 通过implements关键字实现接口
 * 实现类实现了接口后,可以重写所有的抽象方法,子类可以是一个抽象类
 */

public class Inter1Impl implements Inter1{
    @Override
    public void eat() {
        System.out.println("吃肉");
    }

    @Override
    public void play() {
        System.out.println("玩编程");
    }
}
