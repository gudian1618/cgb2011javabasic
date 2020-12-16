package day09.inter;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/16 9:15 下午
 * 测试接口文件
 */

public class Test4Inter {

    public static void main(String[] args) {
        // 创建多态对象
        Inter1 inter = new Inter1Impl();
        inter.eat();
        inter.play();

        // 1.接口不能实例化
        // Inter1 inter1 = new Inter1();

    }

}

