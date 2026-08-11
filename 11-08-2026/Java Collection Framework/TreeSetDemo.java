import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        // TreeSet stores UNIQUE elements
        // Elements are automatically stored in SORTED order
        TreeSet<Integer> set = new TreeSet<>();

        // add() - adds an element
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);
        // [10, 20, 30, 40]

        // Adding duplicate element
        // TreeSet does NOT allow duplicates
        set.add(20);

        System.out.println("After adding duplicate 20: " + set);
        // [10, 20, 30, 40]

        // contains() - checks whether element exists
        boolean found = set.contains(20);

        System.out.println("20 found: " + found);
        // true

        // first() - returns the smallest element
        System.out.println("First element: " + set.first());
        // 10

        // last() - returns the largest element
        System.out.println("Last element: " + set.last());
        // 40

        // lower(x)
        // Returns the largest element STRICTLY LESS than x
        System.out.println("Lower than 30: " + set.lower(30));
        // 20


        // higher(x)
        // Returns the smallest element STRICTLY GREATER than x
        System.out.println("Higher than 30: " + set.higher(30));
        // 40


        // floor(x)
        // Returns the largest element <= x
        System.out.println("Floor of 25: " + set.floor(25));
        // 20


        // ceiling(x)
        // Returns the smallest element >= x
        System.out.println("Ceiling of 25: " + set.ceiling(25));
        // 30

        // remove(x)
        // Removes the specified element
        set.remove(20);

        System.out.println("After removing 20: " + set);

        // pollFirst()
        // Removes and returns the smallest element
        int firstRemoved = set.pollFirst();

        System.out.println("Removed first: " + firstRemoved);
        System.out.println("Set after pollFirst(): " + set);


        // pollLast()
        // Removes and returns the largest element
        int lastRemoved = set.pollLast();

        System.out.println("Removed last: " + lastRemoved);
        System.out.println("Set after pollLast(): " + set);

        // for-each loop
        System.out.println("\nUsing for-each loop:");

        for (int value : set) {
            System.out.println(value);
        }

        // Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // descendingSet()
        // Returns elements in descending order
        System.out.println(
                "Descending Set: " + set.descendingSet()
        );

        // size()
        // Returns number of elements
        System.out.println("Size: " + set.size());


        // isEmpty()
        // Returns true if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // clear()
        // Removes all elements
        set.clear();

        System.out.println("After clear(): " + set);

        System.out.println("Is set empty? " + set.isEmpty());
    }
}