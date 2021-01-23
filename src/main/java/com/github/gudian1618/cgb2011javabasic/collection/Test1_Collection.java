package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/11 7:45 下午
 * 测试collection接口
 */

public class Test1_Collection {

    public static void main(String[] args) {
        // 1.创建Collection接口,泛型使用引用类型,不能使用基本类型
        Collection<Integer> c = new ArrayList<>();

        // 2.常用方法
        // 添加元素
        c.add(100);
        c.add(200);
        c.add(300);
        System.out.println(c);

        // 清空集合
        // c.clear();

        // 判断集合中是否存在指定元素
        System.out.println(c.contains(300));
        // 判断是否相等,表示是否是同一个数据类型并值相等
        System.out.println(c.equals(200));
        System.out.println(c.hashCode());
        System.out.println(c.isEmpty());
        System.out.println(c.remove(200));
        System.out.println(c.size());
        Object[] os = c.toArray();
        System.out.println(os);
        System.out.println(Arrays.toString(os));

        // 结合间的操作
        ArrayList<Integer> c2 = new ArrayList<>();
        c2.add(9);
        c2.add(8);
        c2.add(7);

        c.addAll(c2);
        System.out.println(c);
        System.out.println(c.containsAll(c2));
        // 删除本身元素
        // System.out.println(c.removeAll(c2));
        // 删除除了本身以外的所有元素
        System.out.println(c.retainAll(c2));
        System.out.println(c);

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            // 获取迭代到的元素
            Integer innext = it.next();
            System.out.println(innext);
        }

    }

}
