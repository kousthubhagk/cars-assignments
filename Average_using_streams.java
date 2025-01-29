import java.util.Arrays;
import java.util.List;

public class Average_using_streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        double result = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(result);
    }
}
