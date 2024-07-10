import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        // add(E e) - Inserts the specified element into the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue after add operations: " + queue);

        // offer(E e) - Inserts the specified element into the queue
        queue.offer(4);
        System.out.println("Queue after offer operation: " + queue);

        // element() - Retrieves, but does not remove, the head of the queue
        System.out.println("Head of the queue (using element()): " + queue.element());

        // peek() - Retrieves, but does not remove, the head of the queue
        System.out.println("Head of the queue (using peek()): " + queue.peek());

        // remove() - Retrieves and removes the head of the queue
        int removedElement = queue.remove();
        System.out.println("Removed element (using remove()): " + removedElement);
        System.out.println("Queue after remove operation: " + queue);

        // poll() - Retrieves and removes the head of the queue
        int polledElement = queue.poll();
        System.out.println("Polled element (using poll()): " + polledElement);
        System.out.println("Queue after poll operation: " + queue);

        // Handling empty queue scenario
        queue.clear(); // Clearing the queue
        System.out.println("Queue after clearing: " + queue);
        System.out.println("Peek on empty queue: " + queue.peek()); // Should return null
        try {
            System.out.println("Element on empty queue: " + queue.element()); // Should throw exception
        } catch (Exception e) {
            System.out.println("Exception on element() call: " + e);
        }
        try {
            System.out.println("Remove on empty queue: " + queue.remove()); // Should throw exception
        } catch (Exception e) {
            System.out.println("Exception on remove() call: " + e);
        }
    }
}

