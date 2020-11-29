package day03;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 7:19 下午
 * 测试方法的调用
 */

public class Test6 {
    public static void main(String[] args) {
        System.out.println(1);
        f1();
        System.out.println(2);
        f2(10);
        f3("jack", 20);
        int result = f4(5, 10);
        System.out.println(result);
    }

    public static int f4(int a, int b) {
        return a+b;
    }

    public static void f3(String name, int a) {
        System.out.println(name);
        System.out.println(a);

    }

    public static void f2(int num) {
        System.out.println(num * num);
    }

    public static void f1() {
        System.out.println(3);
        System.out.println(34);
        System.out.println(345);
    }

}
