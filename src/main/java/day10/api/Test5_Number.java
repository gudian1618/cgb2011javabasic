package day10.api;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 3:07 下午
 */

public class Test5_Number {

    public static void main(String[] args) {
        // 1.创建对象
        Integer i1 = new Integer(5);
        // -128~127范围内效率高,相同数据只存一次,静态方法
        Integer i2 = Integer.valueOf(5);
        Integer i3 = Integer.valueOf(5);

        System.out.println(i1 == i2);
        // 静态的valueOf方法志存一次
        System.out.println(i3 == i2);

        // 2.常用方法
        System.out.println(i1.parseUnsignedInt("8000") + 10);

    }

}
