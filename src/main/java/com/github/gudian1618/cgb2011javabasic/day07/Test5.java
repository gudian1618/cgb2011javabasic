package com.github.gudian1618.cgb2011javabasic.day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/10 8:32 下午
 */

public class Test5 {

    public static void main(String[] args) {
        Zi z = new Zi();
        z.eat();
    }

}

// 父类
class Fu {
    int count = 30;
    int sum = 40;

}

// 子类
class Zi extends Fu{
    int sum = 20;
    public void eat() {
        int sum = 10;
        // 就近原则,局部变量
        System.out.println(sum);
        // 调用了本类的成员变量
        System.out.println(this.sum);

        System.out.println(count);
        // 在子类中使用父类中的与子类的同名变量和方法
        System.out.println(super.sum);
    }
}
