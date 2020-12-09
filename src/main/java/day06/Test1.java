package day06;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 8:23 下午
 */

public class Test1 {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.message();
        p.music();

        System.out.println(p.color);
        System.out.println(p.size);
        System.out.println(p.model);
        System.out.println(p.price);
    }

}

class Phone {
    String color;
    String size;
    String model;
    double price;

    public void call() {
        System.out.println("正在打电话");
    }

    public void message() {
        System.out.println("正在发送短信");
    }

    public void music() {
        System.out.println("正在听音乐");
    }
}
