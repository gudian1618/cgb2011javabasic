package day05;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/8 9:46 下午
 * 测试变量的使用
 */

public class Test4 {

    // 2.成员变量:位置在方法外,作用于整个方法,可以不赋值
    static int count;

    // 3.变量的使用有一个就近原则,变量都是使用附近的赋值,如果附近没有,从外面找
    static int sum = 200;

    public static void main(String[] args) {
        // 1.局部变量:位置在方法里,必须完成手动的初始化
        int sum = 100;
        System.out.println(sum);
        System.out.println(count);
    }

}
