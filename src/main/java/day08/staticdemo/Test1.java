package day08.staticdemo;
/**
 * @author gudian1618
 * @date 2020/12/12 5:40 下午
 * @version v1.0
 */

public class Test1 {

    public static void main(String[] args) {
        // 静态资源可以被类名直接调用
        // 静态资源优先于对象加载,比对象优先加载先执行
        System.out.println(Student.name);
        Student.study();

        Student s = new Student();

        // 静态方法和属性可以用对象访问,但不推荐这样使用
        s.study();
        s.name = "tony";
        System.out.println(s.name);

        System.out.println(Student.name);

        // 静态资源在多个对象资源间是共享的
        Student s2 = new Student();
        System.out.println(s2.name);

    }

}

class Student {
    // 只要被static修饰的变量会变成斜体,可以修饰成员变量和成员方法
    static String name = "jack";

    public static void study() {
        System.out.println("study()...");
    }
}
