package collection;

import java.util.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/11 9:36 下午
 * ArrayList
 */

public class Test3_ArrayList {

    public static void main(String[] args) {
        // 1.创建对象
        List<Integer> list = new ArrayList<>();

        // 2.常用方法
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(300);

        list.add(1, 99);
        // list.clear();
        System.out.println(list.contains(500));
        System.out.println(list.indexOf(300));
        System.out.println(list.lastIndexOf(300));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.remove(Integer.valueOf(300)));
        System.out.println(list.set(2, 88));
        System.out.println(list.size());

        Object[] os = list.toArray();
        System.out.println(Arrays.toString(os));

        // 迭代ArrayList和List方式一样
        // 方式1:
        for (int i = 0; i < list.size(); i++) {
            Integer in = list.get(i);
            System.out.println(in);
        }

        // 方式2:
        for (Integer i : list) {
            System.out.println(i+" iter");
        }

        // 方式3:
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next+" iterator");
        }

        // 方式4:
        ListIterator<Integer> it2 = list.listIterator();
        while (it2.hasNext()) {
            Integer next2 = it2.next();
            System.out.println(next2+" listIterator");
        }

    }

}
