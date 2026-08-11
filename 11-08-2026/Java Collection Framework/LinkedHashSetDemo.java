import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        // Maintains insertion order
        System.out.println(set);

        // Check - returns true or false
        //System.out.println(set.contains(20));

        // Remove
        System.out.println(set.remove(10)); //removes and print true or fasle
        set.remove(50); //removes only
        System.out.println(set);

        // Size
        System.out.println(set.size());

        // Iterate
        for (int value : set) {
            System.out.println(value);
        }

        // Clear
        set.clear();
        System.out.println(set);
    }
}