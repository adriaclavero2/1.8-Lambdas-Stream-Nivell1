package Ex6;
import java.util.*;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("hello", 35, "bye", 18, "hola", 99, "moon", 666, "sun");

        List<String> sortedStrings = mixedList.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Sorted strings: " + sortedStrings);
    }
}