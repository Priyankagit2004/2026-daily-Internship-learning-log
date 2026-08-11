import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Returns top element WITHOUT removing
        System.out.println("Top: " + stack.peek());

        // Removes and returns top element
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack: " + stack);

        System.out.println("Contains 10: "
                + stack.contains(10));

        System.out.println("Is empty: "
                + stack.isEmpty());
    }
}