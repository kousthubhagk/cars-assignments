import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class student_department_using_streams {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "Computer Science"),
                new Student("Bob", "Mechanical Engineering"),
                new Student("Charlie", "Electrical Engineering"),
                new Student("David", "Civil Engineering")
        );

        Map<String, List<Student>> departmentMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        departmentMap.forEach((department, student_list) -> {
            student_list.forEach(
                    student -> {
                        System.out.println(student.getName() + " is in the department " + student.getDepartment());
                    }
            );
        });
    }
}
