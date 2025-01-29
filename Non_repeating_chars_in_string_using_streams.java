import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Non_repeating_chars_in_string_using_streams {
    public static void main(String[] args) {
        String name = "kousthubha";
        Map<Character, Long> charCount = name.chars()
                .mapToObj(c -> (char)c) //converting int to char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.print("Non repeating characters: ");
        charCount.entrySet() //method of map interface that returns a set of key value pairs contained in the map
                .stream()
                .filter(e -> e.getValue() == 1)
                .forEach(e -> System.out.print(e.getKey() + ", "));
    }
}
