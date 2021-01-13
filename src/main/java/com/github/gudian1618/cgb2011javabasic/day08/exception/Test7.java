package com.github.gudian1618.cgb2011javabasic.day08.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/15 8:09 下午
 * 测试异常
 * try里面放的是可能发生异常的代码
 * 如果发生了被捕获的异常,就会给出对应的解决方案
 * 由于程序中,可能存在多种异常,所以catch可以多次并列使用
 * 如果还有一些未知的或难以预料的异常,会被Exception捕获
 * 多态,不关心子类的类型,只要是异常,都是Exception的子类,多态会把所有子类当做父类来看,提供通用代码
 */

public class Test7 {

    public static void main(String[] args) {
        // method();
        // method2();
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 抛出 throws
     * 在抛出时,可以使用多态,不管发生什么样的异常,统统被Exception抛出
     */
    private static void method3() throws Exception {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        // 2.输出除法运算的结果
        System.out.println(a / b);
    }

    /**
     * 捕获 try catch
     */
    private static void method2() {
        try {
            // 1.接收用户输入的两个整数
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();

            // 2.输出除法运算的结果
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("第二次输入不能为0");
        } catch (InputMismatchException e) {
            System.out.println("请输入整型");
        } catch (Exception e) {
            System.out.println("请输入正确的整数");
        }
    }

    private static void method() {
        // 1.接收用户输入的两个整数
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        // 2.输出除法运算的结果
        System.out.println(a / b);

    }

}
