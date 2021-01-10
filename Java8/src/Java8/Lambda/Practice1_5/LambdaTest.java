package Java8.Lambda.Practice1_5;

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

        fruits.forEach(LambdaTest::print);
        fruits.forEach(new LambdaTest()::print1);
    }

    public static void print(Fruit f){
        System.out.println(f.getName());
    }
    public void print1(Fruit f){
        System.out.println(f.getName());
    }
}