package com.github.gudian1618.cgb2011javabasic.day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/10 8:5
 * 继承中的构造方法的使用
 * 子类的构造方法默认会调用执行父类的无参构造方法
 */

public class Test7 {

    public static void main(String[] args) {
        Zi3 z3 = new Zi3();

    }

}

class Fu3 {
    public Fu3(String n) {
        System.out.println("父类的构造方法" + n);
    }
}

class Zi3 extends Fu3 {
    public Zi3() {
        // 1.子类的无参构造方法中,默认就会存在super()方法调用父类的无参构造方法,一般省略了
        // 2.在子类创建对象时,会先执行调用父类的无参构造方法,而后调用自己子类的无参构造方法
        // 3.如果父类不存在无参构造时,子类会调用父类存在的含参构造
        super("jack");
        System.out.println("子类的构造方法");
    }
}
