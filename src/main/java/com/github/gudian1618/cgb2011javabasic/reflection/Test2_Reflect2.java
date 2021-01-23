package com.github.gudian1618.cgb2011javabasic.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/21 10:15 下午
 * 测试暴力反射
 */

public class Test2_Reflect2 {
    @Test
    public void getFieldd() throws Exception {
        // 1.获取Class对象
        Class<Person> clazz = Person.class;

        // 2.获取私有属性
        Field field = clazz.getDeclaredField("name");

        // 3.获取属性的数据类型
        System.out.println(field.getType().getName());

        // 4.给私有属性赋值
        Person obj = clazz.getDeclaredConstructor().newInstance();

        // !!!暴力反射手段获取私有值
        field.setAccessible(true);
        field.set(obj, "rose");

        // 5.获取私有属性的值
        System.out.println(field.get(obj));
    }

    @Test
    public void getFunctions() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 1.获取Class类对象
        Class<Person> clazz = Person.class;

        // 2.暴力反射私有方法
        Method method = clazz.getDeclaredMethod("save", int.class, String.class);

        // 3.执行私有方法
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 设置私有可见
        method.setAccessible(true);
        method.invoke(obj, 10, "xiongda");

    }
}
