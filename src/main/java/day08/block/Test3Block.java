package day08.block;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/13 5:32 下午
 * 测试代码块的关系和执行顺序
 */

public class Test3Block {

    public static void main(String[] args) {
        // 特点1.在创建对象前,会自动执行静态代码块,随着类的加载而加载
        // 特点2.在创建对象时,会自动调用构造代码块和构造方法,随着创建对象后而加载
        Person p = new Person();
        // 特点3.当调用方法时,才会调用其包含的局部代码块
        p.show();
        Person p2 = new Person();
        p2.show();
    }

}

class Person {
    // 3.静态代码块: 位置在类里方法外,随着类的加载而加载,而且只会加载一次
    static {
        System.out.println("静态代码块...");
    }

    // 1.构造代码块: 触发节点:创建对象时
    {
        System.out.println("构造代码块...");
    }

    public Person() {
        System.out.println("构造方法");
    }

    // 2.局部代码块: 位置在方法里
    public void show() {
        {
            System.out.println("局部代码块...");
        }
    }

}
