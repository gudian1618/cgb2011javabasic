package com.github.gudian1618.cgb2011javabasic.day06;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 9:13 下午
 */

public class Test3 {

    public static void main(String[] args) {
        // 1.每次new时会自动调用构造方法
        Person p = new Person();
        Person p2 = new Person("jack");
        Person p3 = new Person("rose", 20, "厨房");
    }

}

class Person {

    // 属性

    String name;
    int age;
    String address;

    // 当只提供含参构造,无参构造会被覆盖
    // 构造方法当new对象时,会自动触发,初始化对象调用的方法
    public Person() {
        System.out.println("构造方法");
    }

    // 重载的构造方法
    public Person(String name) {
        // 利用构造方法给成员变量赋值
        this.name = name;
        System.out.println("构造方法重载" + name);
    }

    // 全参构造
    // 其中:name age address是成员变量,也是局部变量
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println(name + age + address);
    }

    // 方法
    public void eat() {
        System.out.println("正在吃饭");
    }
}

