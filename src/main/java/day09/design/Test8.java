package day09.design;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/17 8:55 下午
 * 接口和实现类之间可以发生实现关系,而且可以多实现
 * 编译看左边,运行看右边
 * 实现类,可以继承的同时多实现
 * 接口的多继承,多实现
 */

public class Test8 {

    public static void main(String[] args) {
        // 创建多态对象测试
        Inter1 in = new InterImpl();
        in.save();
        in.update();

        // 创建多态对象
        Inter2 in2 = new InterImpl();
        in2.delete();
        in2.select();

        // 创建接口多继承,接口实现类,接口新的抽象方法和继承来的所有接口的方法
        Inter3 in3 = new InterImpl2();
        in3.add();
        in3.save();
        in3.delete();
        in3.update();
        in3.select();

        Ext ext = new Ext();

    }

}

// 实现类,可以继承的同时多实现
class Ext extends Object implements Inter2, Inter1 {

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void select() {

    }
}

interface Inter3 extends Inter1, Inter2{
    void add();
}

class InterImpl2 implements Inter3 {

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

    @Override
    public void add() {
        System.out.println("add");
    }
}

interface Inter1 {
    void save();

    void update();
}

interface Inter2 {
    void delete();

    void select();
}

class InterImpl implements Inter1, Inter2 {

    @Override
    public void save() {
        System.out.println("save...");
    }

    @Override
    public void update() {
        System.out.println("update...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }

    @Override
    public void select() {
        System.out.println("select...");
    }
}
