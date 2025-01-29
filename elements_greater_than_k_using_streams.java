import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class elements_greater_than_k_using_streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,2,6,1,7,9,5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        nums.stream()
                .filter(n -> n > k)
                .forEach(System.out::println);
    }
}
