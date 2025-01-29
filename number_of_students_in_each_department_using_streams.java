import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class number_of_students_in_each_department_using_streams {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "Computer Science"),
                new Student("Bob", "Electrical Engineering"),
                new Student("Charlie", "Electrical Engineering"),
                new Student("David", "Civil Engineering")
        );

        Map<String, Long> departmentPopulation = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        departmentPopulation.forEach((department, count) -> {
            System.out.println(department + " : " + count);
        });
    }
}
