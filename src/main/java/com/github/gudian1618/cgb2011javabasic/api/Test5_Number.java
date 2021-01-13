package com.github.gudian1618.cgb2011javabasic.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 3:07 下午
 * 包装类型,将基本数据类型封装,便于生成对象调用方法
 */

public class Test5_Number {

    public static void main(String[] args) {
        // 1.创建Integer对象
        Integer i1 = new Integer(5);
        // -128~127范围内效率高,相同数据只存一次,静态方法
        // 底层使用了一个Integer[]数组来进行缓存,只有int范围内有,其他数据没有
        Integer i2 = Integer.valueOf(5);
        Integer i3 = Integer.valueOf(5);

        System.out.println(i1 == i2);
        // 静态的valueOf方法志存一次
        System.out.println(i3 == i2);

        // 2.常用方法
        System.out.println(i1.parseInt("8000") + 10);

        // 3.创建Double对象
        Double d1 = new Double(3.14);
        Double d2 = Double.valueOf(3.14);
        Double d3 = Double.valueOf(3.14);

        System.out.println(d2 == d3);
        // 4.常用方法
        System.out.println(d1.parseDouble("3.14") + 1);

    }

}
