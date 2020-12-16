package day09.inter;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/16 9:25 下午
 * 测试接口的使用
 * 所有类都是隐藏的超级父类Object的子类,包括接口也是继承于隐藏的超级父类Object
 * 接口的实现类在创建的过程中,会继承隐藏的超级父类Object的隐藏无参构造
 * 接口里的所有资源都是public
 * 接口里的变量都是静态常量,只看起来像变量,隐藏了static final
 *
 */

public class Test5UseInter {
    public static void main(String[] args) {
        // 子类创建对象时,会自动调用父类的构造方法?
        // 父类是一个接口,根本没有构造方法,这次在子类中的super()中发生了什么
        // 子类是默认继承超级父类Object,会自动访问超级父类Object的隐藏的无参构造方法
        Inter2 in = new Inter2Impl();

        // System.out.println(in.age);

        // 接口中的变量都是静态变量,可以通过接口名即类名调用
        System.out.println(Inter2.age);

        // 接口里的变量都是长亮,不能被重新赋值
        // Inter2.age = 20;



    }
}

interface Inter2 {
    // 1.接口里有构造方法吗?  接口里没有构造方法,也没有方法体
    // public void eat(){};

    // 2.接口里可以有成员变量吗?  只是看起来可以有,因为接口会自动拼接并隐藏 public static final 关键字,实际是静态常量
    public static final int age = 10;

    // 3.接口里可以有抽象方法,并且可以省略public static关键字,默认公开静态方法
    void eat();

}

class Inter2Impl implements Inter2 {
    public Inter2Impl() {
        // 会自动访问超级父类Object的隐藏的无参构造方法
        super();
        System.out.println("Inter2Impl...");
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }
}
