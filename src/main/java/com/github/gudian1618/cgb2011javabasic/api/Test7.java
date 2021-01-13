package com.github.gudian1618.cgb2011javabasic.api;

import java.util.Objects;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 3:46 下午
 * ==与equals的区别
 */

public class Test7 {

    public static void main(String[] args) {
        Person p1 = new Person("jack", 10);
        Person p2 = new Person("jack", 10);

        // ==比较的是对象,就是比较的对象的地址值
        System.out.println(p1 == p2);
        // ==比较的是基本数据类型,==比较的就是数据本身是否相等
        System.out.println(p1.age == p2.age);

        // 默认使用的是Object的equals()方法,也就是==方法
        // 重写equals()方法后,比较的是对象的属性值,而不再是对象的地址值
        System.out.println(p1.equals(p2));
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 比较对象的属性值

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}
