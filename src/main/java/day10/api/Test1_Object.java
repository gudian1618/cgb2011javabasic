package day10.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/21 9:23 下午
 * 测试Object类的使用
 */

public class Test1_Object {

    public static void main(String[] args) {
        // 创建对象
        Student s = new Student("jack", 10);

        // toString() 返回该对象的字符串表示
        // 查看对象是否赋值成功
        System.out.println(s);
        // 打印出来的是对象在内存中的地址值

    }

}

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

