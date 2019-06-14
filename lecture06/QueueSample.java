package kz.epam.khassenov.lecture06;

import java.util.*;

public class QueueSample {
    public static void main(String[] args) {
        {
            Queue<String> queue = new LinkedList<>();
            queue.offer("Oklahona");
            queue.offer("Indiana");
            queue.offer("Georgia");
            queue.offer("Florida");
            while (queue.size() > 0) {
                System.out.print(queue.remove() + " ");
            }
        }
        {
            PriorityQueue<String> priorityQueueOne = new PriorityQueue<>();
            priorityQueueOne.offer("Alcatraz");
            priorityQueueOne.offer("Birminghem");
            priorityQueueOne.offer("Ceska");
            priorityQueueOne.offer("Dortmund");
            PriorityQueue<String> priorityQueueTwo = new PriorityQueue<>(4, Collections.reverseOrder());
            priorityQueueTwo.addAll(priorityQueueOne);
            System.out.println("\nPriority queue using Comparable: ");
            while (priorityQueueOne.size() > 0) System.out.print(priorityQueueOne.remove() + " ");
            System.out.println("\nPriority queue using Comparator: ");
            while (priorityQueueTwo.size() > 0) System.out.print(priorityQueueTwo.remove() + " ");
            System.out.println();
        }
        {
            Deque<String> deque = new LinkedList<>();
            deque.offer("Oklahoma");
            deque.offer("Indiana");
            deque.offer("Texas");
            deque.offer("Georgia");
            while (deque.size() > 0) System.out.print(deque.remove() + " ");
            System.out.println();
        }
        {
            Deque<String> stack = new ArrayDeque<>();
            Deque<String> queue = new ArrayDeque<>();
            stack.push("A");
            stack.push("B");
            stack.push("C");
            stack.push("D");
            while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            while (!queue.isEmpty()) System.out.print(queue.remove() + " ");
        }
    }
}
