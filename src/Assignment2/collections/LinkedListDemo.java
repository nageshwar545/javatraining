package Assignment2.collections;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> empIds = new LinkedList<>();

        // adding
        empIds.add(100);
        empIds.add(122);
        empIds.add(111);
        empIds.add(104);

        // Printing reverse ord
        empIds.sort(Comparator.reverseOrder());
        System.out.println(empIds);

        System.out.println(empIds.get(1));
    }
}
