import java.util.*;

//Deque = Double Ended Queue
public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(20);
        deque.addLast(30);

        System.out.println("Deque: " + deque);

        deque.offerFirst(10); //add at the start
        deque.offerLast(40); //add at the end

        System.out.println("After offer: " + deque);
        System.out.println("First: "+ deque.peekFirst()); //peekFirst() - returns first element without removing
        System.out.println("Last: " + deque.peekLast()); //peekLast() - returns last element without removing

        deque.pollFirst(); //pollFirst() - removes and returns first element
        deque.pollLast(); //pollLast() - removes and returns last element

        System.out.println("After polling: " + deque);

        deque.removeFirst(); //removeFirst() - removes and returns first element
        deque.removeLast(); //removeLast() - removes and returns last element

        System.out.println("Final deque: " + deque);
    }
}