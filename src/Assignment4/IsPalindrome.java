package Assignment4;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IsPalindrome {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("malayalam", "mom", "wow", "own", "madam", "noon", "test", "rest", "level");
        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reversed);
        };
        List<String> palindromeList = list.stream().filter(isPalindrome).collect(Collectors.toList());
        System.out.println(palindromeList);
    }
}
