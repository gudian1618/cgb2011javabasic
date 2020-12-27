package day11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2020/12/27 6:52 下午
 * file.list列出文件夹中的所有文件和文件夹的名称
 * file.listFiles列出文件夹中的所有文件的文件对象,可以调用该文件的所有功能和方法
 */

public class Test2_File {

    public static void main(String[] args) throws IOException {
        // 1.创建文件对象
        File file = new File("src/main/java/day11/1.txt");
        // 2.测试常用方法
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        // 3.创建,删除
        File file1 = new File("src/main/java/day11/2.txt");
        System.out.println(file1.createNewFile());
        file1 = new File("src/main/java/day11/m");
        System.out.println(file1.mkdir());
        file1 = new File("src/main/java/day11/o/p");
        System.out.println(file1.mkdirs());
        // 删除文件,或空的文件夹,有文件或文件夹的文件夹无法删除
        System.out.println(file1.delete());

        file = new File("src/main/java/day11/");
        // 列出文件夹中的所有文件的名称
        String[] name = file.list();
        System.out.println(Arrays.toString(name));
        // 列出文件夹中的所有文件的文件对象
        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(fs));

    }

}
