package com.github.gudian1618.cgb2011javabasic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 10:34 下午
 */

public class Test10_MapTest {

    public static void main(String[] args) {
        // 1.接收用户输入的字符串
        String input = new Scanner(System.in).nextLine();

        // 创建map存数据
        Map<Character, Integer> hashMap = new HashMap<>();
        // 2.遍历字符串,根据下标获取对应字符串数据
        for (int i = 0; i < input.length(); i++) {
            // 根据下标获取对应的字符
            char key = input.charAt(i);
            // 3.统计出现的每个字符的个数,存起来,存map里
            // 拿着key去map里找value,如果是默认值null就是没存过,存1就行
            Integer value = hashMap.get(key);
            if (value == null) {
                hashMap.put(key, 1);
            } else {
                hashMap.put(key, value + 1);
            }
        }
        System.out.println(hashMap);
    }

}
