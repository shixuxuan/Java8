package Java8.Stream.Practice2_2;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("苹果", "哈密瓜", "香蕉", "西瓜", "火龙果");
        stream.forEach(System.out::println);
    }
}
