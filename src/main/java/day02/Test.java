package day02;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/28 11:16 上午
 * 类型转换
 */

public class Test {

    public static void main(String[] args) {
        // 小转大

        byte m = 10;
        long n = m;

        // 大转小,需要显示的强制类型转换
        float x = 9.9f;
        int y = (int) x;

        System.out.println(3 / 2);
        System.out.println(3 / 2d);

        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b);

        // 整型数据溢出现象
        // 大的整数运算,把整数中最大的数提升成long类型
        System.out.println(300000000L * 60 * 60 * 24 * 365);

        // 浮点数运算不精确
        System.out.println(1 - 0.8);

        // 无穷大
        System.out.println(3.14 / 0);
        // 为空
        System.out.println(0 / 0.0);

        // 获取两个数的最大值
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();

        int max = aa > bb ? aa : bb;
        System.out.println(max);




    }

}
