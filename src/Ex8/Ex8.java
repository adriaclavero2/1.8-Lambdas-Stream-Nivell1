package Ex8;

@FunctionalInterface
interface Reverser {
    String reverse(String input);
}

public class Ex8 {
    public static void main(String[] args) {
        Reverser reverser = s -> new StringBuilder(s).reverse().toString();

        String original = "Adrià";
        String reversed = reverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
