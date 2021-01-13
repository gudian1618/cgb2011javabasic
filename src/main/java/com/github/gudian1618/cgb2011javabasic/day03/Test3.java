package com.github.gudian1618.cgb2011javabasic.day03;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 6:35 下午
 */

public class Test3 {

    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }
        System.out.println("=======");
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
        }
        System.out.println("=======");
        for (int i = 8; i <=8888 ; i=i*10+8) {
            System.out.print(i+",");
        }
    }

}
