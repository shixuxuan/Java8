package Java8.Stream.Practice2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal("狼"),
                new Animal("狗"),
                new Animal("猫"),
                new Animal("牛"),
                new Animal("鸡")
        );

        Stream<Animal> stream = animals.stream();
        stream.forEach((Animal a ) -> {
            System.out.println(a.getName());
        });
    }
}
