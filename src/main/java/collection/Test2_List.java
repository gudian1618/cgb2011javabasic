package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/11 8:09 下午
 * 测试List接口
 */

public class Test2_List {

    public static void main(String[] args) {
        // 1.创建List接口对象
        List<String> list = new ArrayList<>();

        // 2.常用方法
        // 继承自Collection姐口
        list.add("jack");
        list.add("tony");
        list.add("hanmeimei");
        list.add("tony");
        list.add("tony");
        list.add("tony");

        System.out.println(list);

        // 3.List接口的特有方法 -- 都是可以按照索引来操作的方式
        list.add(1, "撒贝宁");
        System.out.println(list);
        System.out.println(list.get(2));
        // 第一次出现的下标
        System.out.println(list.indexOf("tony"));
        System.out.println(list.lastIndexOf("tony"));

        System.out.println(list.remove(4));
        System.out.println(list.set(0,"xiongda"));
        // 左闭右开
        List<String> subList = list.subList(2, 4);
        System.out.println(subList);

        // TODO 集合间的操作
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.addAll(1,list1));
        System.out.println(list);
        System.out.println(list.contains(list1));
        System.out.println(list.removeAll(list1));
        System.out.println(list);
        // System.out.println(list.retainAll(list1));
        // System.out.println(list);

        // TODO List集合的迭代 -- 方式多样,迭代器,for循环,父子类方法
        // 方式1: 普通for下标循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("====");

        // 方式2:语法简洁,效率高,无法指定下标获取
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("====");

        // 方式3: 父类的迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // 方式4: 子类本身的迭代器,拥有父接口的所有方法,并具备子接口的特有方法
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            String s = it2.next();
            System.out.println(s);
        }

    }

}
