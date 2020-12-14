package day08;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/14 10:49 下午
 * 测试多态的入门案例
 * 多态的前提: 1.发生继承关系 2.发生方法的重写
 * 编译(保存)看左边,运行(调试)看右边
 * 多态的出现,是为了统一调用的标准,向父类看齐,父类提供的功能才能用(子类有没有都行),子类特有的功能用不了
 */

public class Test5 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        // 1.父类引用指向子类对象
        Animal a = new Dog();
        // 2.编译(保存)看左边,运行(调试)看右边
        // eat()方法使用的是父类的声明,但是使用的是子类的实现方法
        a.eat();

        // 多态的出现,是为了统一调用的标准,向父类看齐,父类提供的功能才能用,子类特有的功能用不了
        // a.show();
    }

}

class Animal {
    public void eat() {
        System.out.println("吃啥都行");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void show() {
        System.out.println("狗表演");
    }
}
