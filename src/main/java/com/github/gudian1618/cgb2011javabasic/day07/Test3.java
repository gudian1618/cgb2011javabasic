package com.github.gudian1618.cgb2011javabasic.day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 10:09 下午
 * 总结:
 * 1.当创建对象new时,程序会自动调用构造方法,但是,如果有构造代码块,就先执行构造代码块,再执行构造方法
 * 2.当利用对象调用方法时,会触发方法中的功能,如果方法中有局部代码块,会触发局部代码块
 * 3.执行顺序: 先执行构造代码块,然后执行构造方法,最后执行普通方法中的局部代码块
 * 4.局部代码块的作用是,控制变量的作用范围
 */

public class Test3 {

    public static void main(String[] args) {
        // TODO 创建Teacher对象
        // 1.创建对象时,如果有构造代码块,先执行构造代码块,再执行构造方法
        Teacher t = new Teacher();
        // 2.每次new都会执行一次构造代码块
        Teacher t2 = new Teacher();
        // 3.构造代码块常用于提取构造方法中的共性内容
        Teacher t3 = new Teacher("jack");

        t.eat();
    }

}

class Teacher {

    String name;
    // 在类内方法外定义属性和成员变量,一般不赋值有默认值,而后具体使用的时候再进行赋值
    String country;

    // 构造代码块,位置是类里方法外
    {
        // 3.构造代码块常用于抽取构造方法的共性部分,达到复用,避免重复的目的
        country = "中国";
        System.out.println("构造代码块" + country);
    }

    public Teacher() {
        System.out.println("无参构造方法" + country);
    }

    public Teacher(String name) {
        this.name = name;
        System.out.println("有参构造方法" + name + country);
    }

    // 局部代码块:位置在方法里 + 主要用来控制变量的作用范围
    public void eat() {
        {
            int i = 10;
            System.out.println("局部代码块");
        }
        // 已经超出了变量i的作用范围
        // System.out.println(i);
    }
}
