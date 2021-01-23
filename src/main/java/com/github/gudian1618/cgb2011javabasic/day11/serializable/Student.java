package com.github.gudian1618.cgb2011javabasic.day11.serializable;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 8:17 下午
 * java.io.NotSerializableException
 */

public class Student implements Serializable {
    // 给每个文件一个唯一的id值
    private static final long serialVersionUID = 6084133436463387446L;

    private String name;
    private int age;
    private String addr;

    public Student() {
    }

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", addr='" + addr + '\'' +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}
