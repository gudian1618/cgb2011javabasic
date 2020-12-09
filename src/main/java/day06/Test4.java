package day06;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 9:29 下午
 */

public class Test4 {

    public static void main(String[] args) {
        // 默认调用无参构造
        Teacher t = new Teacher();

        // 由于私有化属性,必须提供get和set方法来进行访问
        t.setAddr("北京");
        t.setAge(20);
        t.setName("jack");
        t.setSalary(10000);
        System.out.println(t.getAddr());
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSalary());

        Teacher t2 = new Teacher("rose", 18, 5000, "三亚");
        System.out.println(t2.getName() + t2.getAge() + t2.getSalary() + t2.getAddr());
    }

}

class Teacher {
    // 如果无自定义构造方法,默认提供无参构造方法


    public Teacher() {
        System.out.println("无参构造");
    }

    public Teacher(String name, int age, double salary, String addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    private String name;
    private int age;
    private double salary;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
