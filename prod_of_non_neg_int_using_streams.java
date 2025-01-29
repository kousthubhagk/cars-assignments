import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class prod_of_non_neg_int_using_streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1, 3, -5, -3, 6, 7, -8);

        Optional<Integer> prod = nums.stream()
                .filter(n -> n >= 0)
                .reduce((n1, n2) -> n1 * n2);

        System.out.println(prod.get());
    }
}