package Exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Using a LinkedList as a queue to add and remove elements
        Queue<Integer> q = new LinkedList<>();
        // First, I’ll add 5 elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue after enqueuing 5 elements:" + q);
        // Now, I’ll remove the first two elements
        q.poll();// Removing the first element
        q.poll();// Removing the second element
        System.out.println("Queue after dequeuing 2 elements:" + q);
        // Adding 3 more elements to the queue
        q.add(60);
        q.add(70);
        q.add(80);
        System.out.println("Queue after enqueuing 3 more elements:" + q);

    }
}
