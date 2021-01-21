package com.github.gudian1618.cgb2011javabasic.reflection;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/21 7:53 下午
 * 用来测试反射
 */

public class Student {
    // 提供成员变量
    String name;
    int age;

    // 提供构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 提供成员方法
    public void eat(int m) {
        System.out.println("eat()..." + m);
    }

    // 提供重写的其他方法
    // 方便查看对象的属性值,而不是地址值
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
