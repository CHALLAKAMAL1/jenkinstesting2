import java.util.function.Function;
public class StringReversal {
    public static void main(String[] args) {
        String a = "Hello, World!";
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        String reversed = reverseString.apply(a);
        System.out.println("Reversed String: " + reversed);
    }
}