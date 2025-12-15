package Ex3;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "- January", "- February", "- March", "- April", "- May", "- June",
                "- July", "- August", "- September", "- October", "- November", "- December"
        );

        months.forEach(m -> System.out.println(m));
    }
}