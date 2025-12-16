package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("chair", "mouse", "computer", "table", "sun", "moon", "Only");

        List<String> withO = words.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        withO.forEach(System.out::println);
    }
}