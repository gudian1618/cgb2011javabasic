package com.github.gudian1618.cgb2011javabasic.day06;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 8:38 下午
 */

public class Test2 {

    public static void main(String[] args) {
        Student s = new Student();

        // 给变量赋值
        s.setName("熊大");
        s.setSno(1);
        s.setSubject("java");

        System.out.println(s.getName());
        System.out.println(s.getSno());
        System.out.println(s.getSubject());

        // s.study();
        s.eat();
    }

}

class Student {

    // 如果资源被private修饰,访问权限只能在本类中
    // 提供公共的修改方式和查看方式
    // 提供公共的get和set方法

    // 属性:成员变量
    private String name;
    private int sno;
    private String subject;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 行为:成员方法
    private void study() {
        System.out.println("正在学习");
    }

    public void eat() {
        System.out.println("正在吃饭");
    }

}
