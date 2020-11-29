package day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 8:27 下午
 * 测试数组的练习
 */

public class Test5 {

    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    public static void method3() {
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Random().nextInt(100);
        }
        System.out.println(b);
        System.out.println(Arrays.toString(b));
    }

    public static void method2() {
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }
        System.out.println(b);
        System.out.println(Arrays.toString(b));
    }

    public static void method() {
        // 1.创建数组
        int a[] = {31, 29, 31, 30, 31, 31, 30, 31,30,31,30,30,31};

        // 2.输出每月天数,1月有31天
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println((i+1)+"月有"+a[i]+"天");
        }

    }

}
