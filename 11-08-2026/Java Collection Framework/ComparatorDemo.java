import java.util.*;

class Student {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Priya"));
        list.add(new Student(19, "Aisha"));
        list.add(new Student(21, "Neha"));

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student a, Student b) {
                return b.age - a.age;   // Descending age
            }
        });

        System.out.println(list);
    }
}