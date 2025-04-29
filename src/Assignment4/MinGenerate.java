package Assignment4;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinGenerate {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = Stream.generate(() -> random.nextInt(100) + 1).limit(20).collect(Collectors.toList());
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("Min value "+ min);
    }
}
