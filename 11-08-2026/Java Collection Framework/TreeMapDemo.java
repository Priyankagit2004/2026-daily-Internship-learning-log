import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        // TreeMap stores data in KEY-VALUE pairs
        // Keys are automatically stored in SORTED order
        TreeMap<Integer, String> map = new TreeMap<>();

        // put(key, value) - adds a key-value pair
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("TreeMap: " + map);
        // {1=Apple, 2=Banana, 3=Cherry}

        // put() with an existing key
        // Updates/replaces the old value
        map.put(2, "Mango");

        System.out.println("After updating key 2: " + map);
        // {1=Apple, 2=Mango, 3=Cherry}

        // putIfAbsent()
        // Adds only if the key does NOT already exist
        map.putIfAbsent(4, "Grapes");

        System.out.println("After putIfAbsent(): " + map);

        // get(key) - returns the value associated with the key
        String fruit = map.get(2);

        System.out.println("Value of key 2: " + fruit);
        // Mango

        // getOrDefault(key, defaultValue)
        // Returns default value if key does not exist
        String value = map.getOrDefault(10, "Not Found");

        System.out.println("Value of key 10: " + value);
        // Not Found

        // containsKey(key)
        // Checks whether a key exists
        System.out.println("Contains key 2? " + map.containsKey(2));


        // containsValue(value)
        // Checks whether a value exists
        System.out.println("Contains value Apple? "
                + map.containsValue("Apple"));

        // remove(key)
        // Removes the key-value pair
        map.remove(3);

        System.out.println("After remove(3): " + map);

        // remove(key, value)
        // Removes only if BOTH key and value match
        map.remove(1, "Apple");

        System.out.println("After remove(1, Apple): " + map);

        // firstKey()
        // Returns the smallest key
        System.out.println("First key: " + map.firstKey());

        // lastKey()
        // Returns the largest key
        System.out.println("Last key: " + map.lastKey());

        // firstEntry()
        // Returns the key-value pair with smallest key
        System.out.println("First entry: " + map.firstEntry());

        // lastEntry()
        // Returns the key-value pair with largest key
        System.out.println("Last entry: " + map.lastEntry());

        // floorKey(x)
        // Returns the largest key <= x
        System.out.println("Floor key of 3: " + map.floorKey(3));

        // ceilingKey(x)
        // Returns the smallest key >= x
        System.out.println("Ceiling key of 3: " + map.ceilingKey(3));

        // lowerKey(x)
        // Returns the largest key < x
        System.out.println("Lower key of 3: " + map.lowerKey(3));

        // higherKey(x)
        // Returns the smallest key > x
        System.out.println("Higher key of 3: " + map.higherKey(3));

        // floorEntry(x)
        // Returns entry whose key is <= x
        System.out.println("Floor entry of 3: "
                + map.floorEntry(3));

        // ceilingEntry(x)
        // Returns entry whose key is >= x
        System.out.println("Ceiling entry of 3: "
                + map.ceilingEntry(3));

        // lowerEntry(x)
        // Returns entry whose key is < x
        System.out.println("Lower entry of 3: "
                + map.lowerEntry(3));

        // higherEntry(x)
        // Returns entry whose key is > x
        System.out.println("Higher entry of 3: "
                + map.higherEntry(3));

        // keySet()
        // Returns all keys
        System.out.println("Keys: " + map.keySet());

        // values()
        // Returns all values
        System.out.println("Values: " + map.values());

        // entrySet()
        // Returns all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // Iterating Using keySet()
        System.out.println("\nUsing keySet():");

        for (Integer key : map.keySet()) {

            // map.get(key) gives the value
            System.out.println(key + " -> " + map.get(key));
        }


        // Using entrySet()
        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            // getKey() returns the key
            // getValue() returns the value

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        // size()
        // Returns number of key-value pairs
        System.out.println("\nSize: " + map.size());


        // isEmpty()
        // Returns true if map contains nothing
        System.out.println("Is map empty? " + map.isEmpty());

        // descendingKeySet()
        // Returns keys in descending order
        System.out.println(
                "Descending keys: " + map.descendingKeySet()
        );

        // descendingMap()
        // Returns entire map in reverse order
        System.out.println(
                "Descending map: " + map.descendingMap()
        );

        // clear()
        // Removes all key-value pairs
        map.clear();

        System.out.println("\nAfter clear(): " + map);

        System.out.println("Is map empty? " + map.isEmpty());
    }
}