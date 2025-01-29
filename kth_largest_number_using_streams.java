import java.util.*;

public class kth_largest_number_using_streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        Optional<Integer> kth_largest = nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1) //skip the first k-1 elements so now you have the kth largest element
                .findFirst(); //get the first element

        System.out.println(kth_largest.isPresent()
                ? k + "th largest element is: " + kth_largest.get()
                : "The list is smaller than " + k
        );

        //optional to avoid null pointer errors
    }
}
