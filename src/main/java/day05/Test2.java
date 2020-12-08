package day05;

import java.util.Arrays;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/1 8:31 下午
 */

public class Test2 {

    public static void main(String[] args) {
        // 测试copyOf()
        int[] from = {1, 2, 3, 4, 5, 6};
        // copyOf(m,n) m是要复制的原数组,n如果大于元素的长度,需要开辟新空间添加新位置,扩容
        int[] to = Arrays.copyOf(from, 10);
        // 如果n小于原来的数值,需要截取原数组的部分元素,缩容
        int[] to2 = Arrays.copyOf(from, 3);
        System.out.println(Arrays.toString(to));
        System.out.println(Arrays.toString(to2));
    }

}
