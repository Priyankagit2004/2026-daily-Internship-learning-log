import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("ArrayList: " + list);

        // Accessing elements
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for(String item : list){
            System.out.println(item);
        }

        // Removing an element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Checking if an element exists
        boolean exist = list.contains("Cherry");
        System.out.println("Contains Cherry? " + exist);

        // Size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);
    }
}