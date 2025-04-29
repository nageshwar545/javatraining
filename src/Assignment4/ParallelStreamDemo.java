package Assignment4;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = IntStream.rangeClosed(1,1000).parallel().map(i -> i * i).sum();
        long endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("Time taken "+ (endTime - startTime)+"ms");
    }
}
