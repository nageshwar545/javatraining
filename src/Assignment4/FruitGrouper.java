package Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitGrouper {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "Apple", "Apricot", "Avocado",
                "Banana", "Blackberry", "Blueberry",
                "Cherry", "Cantaloupe",
                "Date", "Dragonfruit",
                "Elderberry", "Eggplant",
                "Fig", "Grape",
                "Honeydew", "Kiwi"
        );
        Map<Character, List<String>> grouped = fruits.stream().collect(Collectors.groupingBy(f -> Character.toUpperCase(f.charAt(0))));
        grouped.forEach((val, list)-> System.out.println(val +" - "+ list));
    }
}
