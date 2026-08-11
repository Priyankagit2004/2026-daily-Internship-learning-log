import java.util.*;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the set 
        set.add("Apple");
        set.add("Banana");
        set.add("Chickoo");
        set.add("Mango");
        System.out.println("HashSet: " + set);

        //accessing elements using iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Checking if an element exists
        boolean exists = set.contains("Mango");
        System.out.println("Contains Mango? " + exists);

        // Size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);


    }
}
