import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        // peek() - returns smallest element
        System.out.println("Smallest: " + pq.peek());

        // poll() - removes smallest element
        System.out.println("Removed: " + pq.poll());

        System.out.println("After poll: " + pq);

        System.out.println("Size: " + pq.size());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);

        System.out.println("Maximum: " + maxHeap.peek());
    }
}