package Java8.Lambda.Practice1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "孟子", "London", 20));
        ar.add(new Student(131, "陈寿", "NYC", 18));
        ar.add(new Student(121, "王维", "Jaipur", 19));
        ar.add(new Student(171, "亚里士多德", "Greek", 24));
        ar.add(new Student(141, "达芬奇", "Italy", 22));

        System.out.println("原始集合");
        ar.forEach(s -> System.out.println(s));

        Collections.sort(ar, (Student a, Student b) -> {
            return b.getAge() - a.getAge();
        });

        System.out.println("\n排序后的集合");
        ar.forEach(s -> System.out.println(s));
    }
}
