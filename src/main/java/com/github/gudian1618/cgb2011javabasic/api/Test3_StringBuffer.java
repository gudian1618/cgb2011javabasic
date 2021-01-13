package com.github.gudian1618.cgb2011javabasic.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/23 8:22 下午
 * 优化字符串拼接
 * +拼接字符串效率低下
 * 工具类提供的方法,进行了效率优化
 * 1.字符串在拼接时,由于字符串一旦确定就不可修改
 * 每次+都会产生新的字符串对象.频繁创建字符串对象,浪费时间
 * 2.工具类快,因为StringBuffer是可变的数组,会把新的数据拼接在原有数据的末尾处
 * 无论拼接多少次,只会创建一次,使用的都是同一个字符串对象,不用频繁创建字符串对象
 */

public class Test3_StringBuffer {

    public static void main(String[] args) {
        // 完成＋拼接字符串
        // method();
        // 优化拼接方法
        method2();
    }

    private static void method2() {
        // 1.定义字符串
        String str = "fasdfsarwerwerrrrwrwedfasdfas";

        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        // 计时开始
        long s = System.currentTimeMillis();
        // 2.将制定的字符串拼接10000
        String result = "";
        for (int i = 0; i < 10000; i++) {
            // 工具类提供的快速拼接字符串的方法
            // sb.append(str);
            sb2.append(str);
        }
        // 计时结束
        long s2 = System.currentTimeMillis();

        // 3.打印拼接后的字符串
        System.out.println(s2 - s);
    }

    private static void method() {
        // 1.定义字符串
        String str = "fasdfsarwerwerrrrwrwedfasdfas";

        // 计时开始
        long s = System.currentTimeMillis();
        // 2.将制定的字符串拼接10000
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result = result + str;
        }
        // 计时结束
        long s2 = System.currentTimeMillis();

        // 3.打印拼接后的字符串
        System.out.println(s2 - s);
    }

}
