import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class code3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ravi", 80));
        list.add(new Student("Anu", 95));
        list.add(new Student("John", 70));

        Collections.sort(list, Comparator.comparingInt(s -> s.marks));

        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
