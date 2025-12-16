package Ex2;

import java.util.*;
import java.util.stream.Collectors;

public class Ex2 {

    public static List<String> filterStrings(List<String> input) {
        return input.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "computer", "bye", "programming", "sun", "moon", "Only!!");

        List<String> result = filterStrings(words);

        System.out.println("Result: " + result);
    }
}