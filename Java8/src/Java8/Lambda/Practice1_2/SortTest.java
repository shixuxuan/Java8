package Java8.Lambda.Practice1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main (String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(111,"bbbb", "london"));
        students.add(new Student(131,"aaaa", "nyc"));
        students.add(new Student(121,"cccc", "jaipur"));

        Collections.sort(students, (student1, student2) -> {
            return student1.getRollNo() - student2.getRollNo();
        });

        students.forEach(s -> System.out.println(s));
    }
}
