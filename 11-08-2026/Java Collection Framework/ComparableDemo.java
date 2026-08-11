import java.util.*;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;   // Sort by age
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Priya"));
        list.add(new Student(19, "Aisha"));
        list.add(new Student(21, "Neha"));

        Collections.sort(list);

        System.out.println(list);
    }
}