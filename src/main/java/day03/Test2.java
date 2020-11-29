package day03;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/11/29 6:32 下午
 */

public class Test2 {

    public static void main(String[] args) {
        int a = 2;
        // 支持byte,short,int,char,String
        switch (a) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            default:
                System.out.println(0);
        }
    }

}
