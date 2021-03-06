package Java8.Lambda.Practice1_1;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("香蕉"),
                new Fruit("苹果"),
                new Fruit("梨子"),
                new Fruit("西瓜"),
                new Fruit("荔枝")
        );

        fruits.forEach(f -> {
            System.out.println(f.getName());
        });
    }
}
