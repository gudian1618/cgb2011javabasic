package day10.api;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/24 10:44 下午
 * 测试正则表达式
 */

public class Test4_Regex {

    public static void main(String[] args) {
        // 1.接收用户输入的身份证号
        String input = new Scanner(System.in).nextLine();

        // 身份证号18位,最后一位可能是xX,前17位是数字

        String regex = "";
        // 2.判断用户输入的是身份证号格式吗 -- 正则
        // matches是String类提供的功能,用来判断字符串是否符合正则表达式的要求
        if (input.matches(regex)) {
            System.out.println("ok...");
        } else {
            System.out.println("no ok...");
        }
    }

}

