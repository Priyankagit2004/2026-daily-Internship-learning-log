import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // offer() - adds element
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // peek() - returns first WITHOUT removing
        System.out.println("First: " + queue.peek());

        // poll() - removes and returns first
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue: " + queue);

        System.out.println("Size: " + queue.size());

        System.out.println("Contains 20: "+ queue.contains(20));

        System.out.println("Is empty: "+ queue.isEmpty());
    }
}