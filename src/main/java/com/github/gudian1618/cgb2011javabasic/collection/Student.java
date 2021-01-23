package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.Objects;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 9:13 下午
 * 用来测试set集合自定义对象去重
 * 总结:
 * 如果想用Set集合对自定义对象去重,必须重写hashCode和toString方法实现,通过属性值相同保证两个对象的hash值对象地址值相同
 */

public class Student {

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(addr, student.addr);
    }

    // 如果属性值完全一样,则hash值完全一样,重写该方法实现
    @Override
    public int hashCode() {
        return Objects.hash(name, age, addr);
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
