package day03;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 7:10 下午
 * 测试嵌套for循环
 */

public class Test5 {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            // 内循环条件跟着外循环变化
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");

            }
            System.out.println();
        }
    }

}
