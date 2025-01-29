public class Student {
    private String name;
    private String department;

    // Constructor
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + department;
    }
}
