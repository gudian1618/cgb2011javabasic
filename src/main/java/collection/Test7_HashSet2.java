package collection;

import java.util.HashSet;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/1/12 9:16 下午
 * 自定义对象去重
 */

public class Test7_HashSet2 {

    public static void main(String[] args) {
        // 1.创建Set集合对象
        HashSet<Student> set = new HashSet<>();
        // 2.自定义去重
        Student s1 = new Student("tony",20,"北京");
        Student s2 = new Student("jack",30,"上海");
        Student s3 = new Student("rose",20,"深圳");

        Student s4 = new Student("jack",30,"上海");
        Student s5 = new Student("rose",20,"深圳");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());

    }

}
