package com.github.gudian1618.cgb2011javabasic.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/22 8:47 下午
 */

public class Test2_String {

    public static void main(String[] args) {
        // 1.创建String对象
        char[] value = {'a', 'b', 'c'};
        // 字符串底层维护了一个char[]
        // 存放内存的堆中,会重复创建存放
        String s1 = new String(value);

        // 2.底层也会new String()
        // 存放在内存的堆的常量池空间中,相同元素只会存放一次,效率高,不会重复创建
        String s2 = "abcac";

        // 3.常见方法
        // 获取下标为1的char字符
        System.out.println(s2.charAt(1));
        // 在字符串原有的基础上进行拼接
        System.out.println(s2.concat("opq"));
        // 字符串是否以该字符串结尾
        System.out.println(s2.endsWith("pq"));
        // String重写了equals()方法,比较的是两个字符串的属性值本身
        System.out.println(s1.equals(s2));
        // 将字符串转成byte[]数组
        System.out.println(s2.getBytes());
        // 字符串中第一次出现(最左边)某部分的索引值
        System.out.println(s2.indexOf("c"));
        // 字符串中最后一次出现(最右边)某部分的索引值
        System.out.println(s2.lastIndexOf("c"));
        // 字符串的长度
        System.out.println(s2.length());
        s2 = "a b c d e f";
        // 按照一定的规则切割字符串
        System.out.println(s2.split(" "));
        // 判断字符串是否以某个部分开始
        System.out.println(s2.startsWith("a"));
        // 从下标为1的位置开始截取
        System.out.println(s2.substring(1));
        // 从起始下标和终止下标截取字符串, 左闭右开区间,含头不含尾
        System.out.println(s2.substring(3, 7));
        // 使字符串全部小写
        System.out.println(s2.toLowerCase());
        // 使字符串全部大写
        System.out.println(s2.toUpperCase());
        s2 = "   abcdefg   ";
        // 去掉字符串最前最后的多余空格
        System.out.println(s2.trim());
        // 将数值型转换成字符串型的静态方法,字符串与任何拼接都是字符串
        System.out.println(String.valueOf(10) + 10);
    }

}
