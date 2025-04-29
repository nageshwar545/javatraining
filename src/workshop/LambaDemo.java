package workshop;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambaDemo {
    public static void main(String[] args) {
        Stream<Integer> streamOfIntergers = Stream.generate(() -> new Random().nextInt(100)+1).limit(10);
        IntStream ints = streamOfIntergers.mapToInt(Integer::intValue);
        int sumValue = ints.sum();
        System.out.println(sumValue);
    }
}
