package com.github.gudian1618.cgb2011javabasic.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 9:19 下午
 * 测试泛型
 * 数组的好处:在编译期检查数据的类型,如果不是要求的类型会在编译期就报错
 */

public class Test_Generic {

    public static void main(String[] args) {
        // 1.泛型是怎么来的? 想要模拟数据的类型检查
        String[] a = new String[5];

        // 2.泛型通常结合集合一起使用
        // 没有的泛型,数据类型没有约束,非常自由,有很多问题
        List list = new ArrayList();

        // 3.泛型:主要想约束集合中元素的类型<?>
        List<String> list1 = new ArrayList<>();
        // 4.泛型可以把报错时机提前,在编译期就报错,而不是在运行期报错或者抛出异常
        list1.add("qwe");
        list1.add(String.valueOf(12));

        // <type>要存放的是什么类型
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
    }

}
