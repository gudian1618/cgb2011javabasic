package day08.staticdemo;
/**
 * @author gudian1618
 * @date 2020/12/12 5:40 下午
 * @version v1.0
 */

public class Test1 {

    public static void main(String[] args) {
        Student s = new Student();
    }

}

class Student {
    // 只要被static修饰的变量会变成斜体,可以修饰成员变量和成员方法
    static String name = "jack";

    public static void study() {
        System.out.println("study()...");
    }
}
