package Java8.Lambda.Practice1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main (String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(111,"张三","london",20));
        students.add(new Student(131,"李四","nyc",18));
        students.add(new Student(121,"王五","jaipur",19));
        // 实现升序排序
        Collections.sort(students, (student1, student2) -> {
            // 第一个参数的学号 > 第二个参数的学号
            return student2.getAge() - student1.getAge();
        });

        students.forEach(s -> System.out.println(s));

    }
}
