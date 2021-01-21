package com.github.gudian1618.cgb2011javabasic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/21 6:57 下午
 * 测试自定义注解
 */

public class Test1_Annotation {
    public static void main(String[] args) {

    }
}

/**
 * @author gudian1618
 * 自定义注解,与java普通语法不通
 * 1.定义注解用@interface标志: 注解名
 * 2.@Target指定注解存在的位置
 * 3.@Retentionz指定注解可以存在的生命周期上
 */
// 用于目标对象可以多个
@Target({ElementType.METHOD, ElementType.TYPE})
// 生命周期必须出现一个值
@Retention(RetentionPolicy.SOURCE)
@interface Test {
    // 给注解中添加属性,属性名称添加括号定义声明
    // 赋值默认值用default赋值,而不是=
    int age() default 0;

    // 特殊属性value,属性有默认值时,使用时可以不用赋值,没有默认必须赋值
    String value() default "jack";
}

// 使用注解
// 只要在指定的注解名字面前加上@即可使用,可以定义多个值,用花括号包起来,用逗号隔开
// @Test
class Hello {
    // @Test
    String name;

    // 由于有默认值,可以直接使用
    // @Test(),有属性必须添加属性值,必须将属性值赋值具体写出来赋值
    // 定义了普通属性并赋值
    // @Test(age = 10)
    // 给value属性赋值可以简写成"xxx",相当于value="xxx"
    @Test("add")
    public void add() {
        System.out.println("add()");
    }
}
