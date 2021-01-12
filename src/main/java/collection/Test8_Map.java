package collection;

import java.util.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 9:50 下午
 */

public class Test8_Map {

    public static void main(String[] args) {
        // 1.创建Map对象
        // Map中的数据要符合映射规则,需要同时指定K和V的数据类型,根据实际数据类型一致
        Map<Integer, String> map = new HashMap<>();

        // 2.常用方法
        // map中必须同时指定K和V的值
        map.put(9527, "唐伯虎");
        map.put(9528, "如花");
        map.put(9529, "秋香");
        // map中K不建议重复,如果重复,V会被覆盖
        map.put(9529, "石榴姐");

        System.out.println(map);

        System.out.println(map.containsKey(9527));
        System.out.println(map.containsValue("如花"));
        System.out.println(map.equals("如花"));
        System.out.println(map.get(9528));
        System.out.println(map.hashCode());
        System.out.println(map.isEmpty());
        System.out.println(map.remove(9529));
        System.out.println(map.size());
        Collection<String> vs = map.values();
        System.out.println(vs);

        // 遍历map中的数据,需要把map集合转成set集合,然后遍历
        Set<Integer> ks = map.keySet();
        // ks调用set的迭代器方法遍历
        Iterator<Integer> it = ks.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

        // entrySet map中的一组数据全部放入到set集合中
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        // 遍历set
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }


    }
}
