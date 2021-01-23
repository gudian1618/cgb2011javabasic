package com.github.gudian1618.cgb2011javabasic.day05;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/1 9:31 下午
 * 测试二维数组
 */

public class Test3 {

    public static void main(String[] args) {
        // 1.创建二维数组
        int[][] a = {{1, 3}, {4, 5}, {7, 9}};
        // 2.遍历二维数组
        for (int i = 0; i < a.length; i++) {
            // a[i].length根据外部数组的下标获取,a[i]优惠一个数组
            for (int j = 0; j < a[i].length; j++) {
                // 根据内外数组下标定位数据
                System.out.println(a[i][j]);
            }
        }
    }

}
