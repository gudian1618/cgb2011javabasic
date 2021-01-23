package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.LinkedList;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/11 10:03 下午
 * 底层维护了一个链表,增删快,查询慢,查询用ArrayList
 */

public class Test4_LinkedList {

    public static void main(String[] args) {
        // 1.创建对象
        LinkedList<String> list = new LinkedList<>();

        // 2.常用方法
        list.add("杰克");
        list.add("rose");
        list.add("奥特曼");
        list.add("蜘蛛侠");
        System.out.println(list);

        // TODO LinkedList特有方法,对首尾元素进行增删操作
        list.addFirst("美队");
        list.addLast("煎饼侠");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

    }

}
