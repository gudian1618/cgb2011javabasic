package day11.serializable;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/10 8:15 下午
 * 序列化:便于把java对象永久保存到磁盘中,便于传输和存储
 * 反序列化:把已经序列化好的文件,读取恢复到java程序中的过程
 */

public class Test1_Seria {

    public static void main(String[] args) {
        // 1.序列化
        method();
        // 2.反序列化
        method2();
    }

    private static void method2() {
        ObjectInputStream in = null;
        try {
            // 1.创建反序列化的对象
            in = new ObjectInputStream(new FileInputStream("src/main/java/day11/serializable/1.txt"));
            // 2.指定要读取的对象
            Object o = in.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void method() {
        try {
            // 1.创建序列化对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/day11/serializable/1.txt"));
            // 2.指定要输出的对象
            Student obj = new Student("jack", 20, "北京");
            out.writeObject(obj);
            System.out.println("序列化完成!");
        } catch (IOException e) {
            System.out.println("序列化失败!");
            e.printStackTrace();
        }
    }

}
