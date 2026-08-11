import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println("HashMap: " + map);

        // Accessing values using keys
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Checking if a key exists
        boolean exists = map.containsKey(4);
        System.out.println("Contains key 4? " + exists);

        // Size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);
    }    
}
