package Java8.Stream.Practice2_5;

import java.util.Arrays;
import java.util.List;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 63, 2, 3, 5);
        numbers.stream().map(num -> {
            return num * num;
        }).forEach(System.out::println);
    }
}
