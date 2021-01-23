package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 8:47 下午
 */

public class Test6_HashSet {

    public static void main(String[] args) {
        // 1.创建HashSet对象
        HashSet<Integer> set = new HashSet<>();

        // 2.常用方法
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);

        System.out.println(set.contains(200));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(100));
        System.out.println(set.size());

        // 迭代
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer in = it.next();
            System.out.println(in);
        }

    }

}
