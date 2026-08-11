import java.util.*;

public class LinkesListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add() - adds element at the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("LinkedList: " + list);

        // add(index, element) - adds element at a specific index
        list.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + list);


        // addFirst() - adds element at the beginning
        list.addFirst("Orange");
        System.out.println("After addFirst(): " + list);


        // addLast() - adds element at the end
        list.addLast("Grapes");
        System.out.println("After addLast(): " + list);

        // contains() - returns true or false
        boolean found = list.contains("Banana");
        System.out.println("Banana found: " + found);

        // indexOf() - returns the first index of the element
        int index = list.indexOf("Banana");
        System.out.println("Index of Banana: " + index);

        // lastIndexOf() - returns the last index of the element
        list.add("Banana");

        int lastIndex = list.lastIndexOf("Banana");
        System.out.println("Last index of Banana: " + lastIndex);

        // get(index) - accesses element at a particular index
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst() - gets the first element
        String firstElement = list.getFirst();
        System.out.println("First element: " + firstElement);

        // getLast() - gets the last element
        String lastElement = list.getLast();
        System.out.println("Last element: " + lastElement);

        // set(index, element) - replaces element at given index
        list.set(1, "Blueberry");
        System.out.println("After updating index 1: " + list);

        // remove(Object) - removes a particular element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // remove(index) - removes element at a particular index
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // removeFirst() - removes the first element
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast() - removes the last element
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // size() - returns number of elements
        System.out.println("Size of list: " + list.size());

        // isEmpty() - returns true if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // peek() - returns first element WITHOUT removing it
        System.out.println("peek(): " + list.peek());

        // peekFirst() - returns first element WITHOUT removing it
        System.out.println("peekFirst(): " + list.peekFirst());

        // peekLast() - returns last element WITHOUT removing it
        System.out.println("peekLast(): " + list.peekLast());

        // offer() - adds element at the end
        list.offer("Kiwi");
        System.out.println("After offer(): " + list);

        // offerFirst() - adds element at the beginning
        list.offerFirst("Watermelon");
        System.out.println("After offerFirst(): " + list);

        // offerLast() - adds element at the end
        list.offerLast("Papaya");
        System.out.println("After offerLast(): " + list);

        // poll() - removes and returns the first element
        String removed = list.poll();
        System.out.println("Removed using poll(): " + removed);
        System.out.println("List after poll(): " + list);

        // pollFirst() - removes and returns first element
        String removedFirst = list.pollFirst();
        System.out.println("Removed using pollFirst(): " + removedFirst);
        System.out.println("List after pollFirst(): " + list);

        // pollLast() - removes and returns last element
        String removedLast = list.pollLast();
        System.out.println("Removed using pollLast(): " + removedLast);
        System.out.println("List after pollLast(): " + list);

        // for loop
        System.out.println("\nUsing for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // for-each loop
        System.out.println("\nUsing for-each loop:");

        for (String element : list) {
            System.out.println(element);
        }

        // Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // clear() - removes everything from the list
        list.clear();

        System.out.println("\nAfter clearing the list: " + list);

        // Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}