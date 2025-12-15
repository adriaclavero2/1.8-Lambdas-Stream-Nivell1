package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("chair", "mouse", "computer", "table", "sun", "moon");

        Predicate<String> containsO = s -> s.contains("o");

        List<String> withO = words.stream()
                .filter(containsO)
                .collect(Collectors.toList());

        withO.forEach(System.out::println);
    }
}