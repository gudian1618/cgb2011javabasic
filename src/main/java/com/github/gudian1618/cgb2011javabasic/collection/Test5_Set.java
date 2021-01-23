package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 8:30 下午
 * Set接口的用法
 * Set集合中的元素都是无序乱序的,不能重复的,允许存放一次null元素
 */

public class Test5_Set {

    public static void main(String[] args) {
        // 1.创建Set对象
        Set<String> set = new HashSet<>();

        // 2.常用方法
        set.add("jack");
        set.add("rose");
        set.add("tony");
        set.add("heanmeiemi");

        System.out.println(set);
        System.out.println(set.contains("tony"));
        System.out.println(set.equals("tony"));
        System.out.println(set.hashCode());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("null"));
        System.out.println(set.size());
        Object[] obs = set.toArray();
        System.out.println(Arrays.toString(obs));

        // 集合间的操作
        HashSet<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("3");
        System.out.println(set.addAll(set2));
        System.out.println(set);
        System.out.println(set.containsAll(set2));
        System.out.println(set);
        // System.out.println(set.retainAll(set2));
        System.out.println(set);
        System.out.println(set.removeAll(set2));
        System.out.println(set);

        // 集合的迭代
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }

}
