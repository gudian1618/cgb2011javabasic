package com.github.gudian1618.cgb2011javabasic.reflection;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/21 10:13 下午
 */

public class Person {
    // 私有属性
    private String name;
    private int age;

    // 私有方法
    private void save(int m, String n) {
        System.out.println("save()..." + m + n);
    }

    private void update() {
        System.out.println("update...");
    }
}
