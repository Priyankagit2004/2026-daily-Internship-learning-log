import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // iterator() returns an Iterator object
        Iterator<Integer> it = list.iterator();

        // hasNext() checks whether another element exists
        while (it.hasNext()) {
            // next() returns the next element
            System.out.println(it.next());
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {

            int value = iterator.next();

            // Remove 20 safely while iterating
            if (value == 20) {
                iterator.remove();
            }
        }

        System.out.println("After removing 20: " + list);
    }
}

