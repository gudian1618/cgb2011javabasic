package day07;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/10 8:39 下午
 * 继承中成员方法的使用
 * 如果只是继承,执行的是父类的方法
 * 如果重写继承方法,实现的是重写后的子类实现方法
 */

public class Test6 {

    public static void main(String[] args) {
        Zi2 z2 = new Zi2();
        z2.eat();
        z2.study();

    }

}

// 父类
class Fu2 {
    public void eat() {
        System.out.println("爸爸在吃肉");
    }
}

// 子类
class Zi2 extends Fu2{
    public void study() {
        System.out.println("儿子正在学习java");
    }

    // 在子类中通过重写,修改继承来的方法的具体实现,不改变父类而改写子类
    // 重写:和父类的方法签名一模一样,用注解@override
    // 子类必须拥有权限去重写父类的功能,子类的方法修饰符,必须大于等于父类的方法修饰符
    @Override
    public void eat() {
        super.eat();
        System.out.println("儿子在喝汤");
    }
}
