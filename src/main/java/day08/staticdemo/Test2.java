package day08.staticdemo;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/13 5:25 下午
 * 测试静态的调用关系
 */

public class Test2 {

    public static void main(String[] args) {

    }

}

class Teacher {
    // 普通资源
    String name;

    public void teach() {
        // 普通资源能否调用静态资源:   可以
        eat();
        System.out.println(age);
        System.out.println("teach()...");
    }

    // 静态资源
    static int age;

    public static void eat() {
        // 静态资源能否调用普通资源:    不可以
        // name;
        // teach();
        System.out.println("eat()...");
    }

}
