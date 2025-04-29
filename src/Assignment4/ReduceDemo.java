package Assignment4;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = IntStream.range(0,20).map(i -> random.nextInt(10) + i).boxed().collect(Collectors.toList());
        System.out.println("List "+numbers);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum "+ sum);
    }
}
