import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Maintains insertion order
        System.out.println(map);

        // Access
        System.out.println(map.get(2));

        // Search
        System.out.println(map.containsKey(1));

        // Remove
        map.remove(3);

        System.out.println(map);

        // Iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue() );
        }

        // Size
        System.out.println(map.size());

        // Clear
        map.clear();

        System.out.println(map);
    }
}