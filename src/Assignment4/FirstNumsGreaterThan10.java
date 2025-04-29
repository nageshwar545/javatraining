package Assignment4;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNumsGreaterThan10 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = Stream.generate(() -> random.nextInt(100) + 1).limit(20).collect(Collectors.toList());
        List<Integer> greaterThan10 = numbers.stream().filter((n) -> n > 10).collect(Collectors.toList());
        System.out.println(greaterThan10);
    }
}
