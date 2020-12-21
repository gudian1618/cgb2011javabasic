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
        // 打印出来的是对象在内存中的地址值
        // 原因:再打印对象时,底层会自动调用toString(),而且使用的是Object的提供的方法
        System.out.println(s);
        // 重写toString方法,是打印的对象的属性值,用idea自带的默认生成的重写toString方法,json格式
        // 不重写打印的是对象的地址值,也就是hash值

        // 返回对象在内存中的哈希码值
        System.out.println(s.hashCode());

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

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

