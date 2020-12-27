package day10.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 3:42 下午
 * 自动拆箱,自动装箱
 */

public class Test6_Box {

    public static void main(String[] args) {
        // 1.自动装箱:定义包装类型的数据
        // 底层采用Integer.valueOf(5)方法自动装箱
        Integer i1 = 5;

        // 2.自动拆箱:把包装类型的数据拆掉变回基本数据类型
        // 底层采用i1.intValue()方法自动拆箱
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
    }

}
