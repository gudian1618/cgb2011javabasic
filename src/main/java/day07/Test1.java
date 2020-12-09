package day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/9 9:43 下午
 */

public class Test1 {

    public static void main(String[] args) {
        // TODO 创建爱你Person对象
        Person p = new Person();
        p.eat();
    }

}

class Person {
    // 成员变量
    int sum = 20;

    public void eat() {
        // 局部变量
        int sum = 10;
        System.out.println(sum);
        // 如果成员变量与局部变量同名,本名用的是局部变量,因为就近原则,用this.变量名指代的是成员变量
        // 用this可以调用成员变量,前提是成员变量与局部变量重名
        System.out.println(this.sum);
    }
}
