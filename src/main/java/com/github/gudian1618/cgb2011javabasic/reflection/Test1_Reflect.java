package com.github.gudian1618.cgb2011javabasic.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/21 7:29 下午
 * 测试反射技术
 */

public class Test1_Reflect {

    // 单元测试方法,是java测试的最小单位
    @Test
    public void getClazz() throws Exception {
        // 获取类对象
        // 1.包名写法,参数是:包名.类全名
        Class<?> student = Class.forName("com.github.gudian1618.cgb2011javabasic.reflection.Student");
        // 2.类名.class调用
        Class<Student> student2 = Student.class;
        // 3.匿名对象,对象没有名字
        Class<? extends Student> student3 = new Student().getClass();

        System.out.println(student);
        System.out.println(student2.getName());
        System.out.println(student3.getSimpleName());
        System.out.println(student3.getPackageName());
    }

    // 用反射获取构造方法
    @Test
    public void getConstruct() {
        // 1.获取Class对象
        Class<Student> clazz = Student.class;

        // 2.获取构造方法
        Constructor<?>[] cs = clazz.getConstructors();

        // 3.获取每个构造
        // 使用迭代遍历循环
        for (Constructor<?> c : cs) {
            System.out.println(c.getName());
            Class<?>[] cc = c.getParameterTypes();
            System.out.println(Arrays.toString(cc));
        }
    }

    // 用反射获取成员方法
    @Test
    public void getFunction() throws ClassNotFoundException {
        // 1.获取Class对象
        Class<?> clazz = Class.forName("com.github.gudian1618.cgb2011javabasic.reflection.Student");

        // 2.获取成员方法们,存入ms
        Method[] ms = clazz.getMethods();

        // 3.获取每个方法
        for (Method m : ms) {
            // 获取方法名
            System.out.println(m.getName());
            // 获取方法参数类型
            Class<?>[] cc = m.getParameterTypes();
            System.out.println(Arrays.toString(cc));
        }

    }

    // 用反射获取成员变量
    // 反射,默认只能够获取到公共的成员变量,pojo里面的修饰符没有默认default获取不到,所以必须public或private
    @Test
    public void getField() throws Exception {
        // 1.获取Class对象
        Class<Student> clazz = Student.class;

        // 2.获取所有的船员变量
        Field[] fs = clazz.getFields();

        // 3.遍历每个成员变量
        for (Field f : fs) {
            // 获取变量名
            System.out.println(f.getName());
            // 获取获取变量类型名
            System.out.println(f.getType().getName());
        }

    }

    // 用反射创建对象
    @Test
    public void getObject() throws Exception {
        // 1.获取Class对象
        Class<Student> clazz = Student.class;

        // 2.创建实例
        // Student student = clazz.newInstance();
        // Student student = clazz.getConstructor().newInstance();
        Student student = clazz.getDeclaredConstructor().newInstance();
        System.out.println(student);

        // 3.具体指定使用哪个构造方法(可以无参构造,可以含参构造)
        Constructor<Student> c = clazz.getConstructor(String.class, int.class);

        // 4.触发指定的构造方法
        Student obj = c.newInstance("jack", 20);
        System.out.println(obj);

    }

}
