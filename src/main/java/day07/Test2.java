package day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 9:48 下午
 */

public class Test2 {

    public static void main(String[] args) {
        // TODO 创建对象时会自动调用构造方法
        Student s = new Student();
        Student s2 = new Student("jack");
    }

}

class Student {

    String name;

    public Student() {
        // 在无参构造中调用含参构造的功能,而且只能单向调用
        // 必须先调用其他方法而后调用自己的方法,否则就会提前结束而无法调用其他构造方法
        // this()在构造方法中必须在第一条语句
        this("rose");
        System.out.println("无参构造");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("含参构造" + name);
    }
}
