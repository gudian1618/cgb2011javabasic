package day11.file;

import java.io.File;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/28 7:57 下午
 * 递归求目录总大小
 * 1.列出文件夹下的所有资源listFiles()
 * 2.判断,当前资源是文件还是文件夹
 * -- 是文件,求文件字节量大小length()求和
 * -- 是文件夹,重复1,2步骤递归
 */

public class Test3_DiGui {

    public static void main(String[] args) {
        // 1.指定要求哪个目录的总大小
        File file = new File("src/main/java/day11");
        // 2.求目录大小
        long total = size(file);
        System.out.println(total);
    }

    private static long size(File file) {
        // 1.列出文件夹下的所有资源
        File[] fs = file.listFiles();
        long sum = 0;
        for (int i = 0; i < fs.length; i++) {
            // 获取当前文件对象
            File f = fs[i];
            if (f.isFile()) {
                sum += f.length();
            } else if (f.isDirectory()) {
                // 在方法内部调用方法本身,即发生了递归调用
                sum += size(f);
            }
        }
        // 把sum记录的值返回调用位置
        return sum;
    }

}
