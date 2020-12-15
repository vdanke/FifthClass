package org.step.collections.queue;

import org.step.collections.Person;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

    public static void main(String[] args) {
        queueExample();
    }

    public static void queueExample() {
        Queue<Person> queue = new PriorityQueue<>();

        queue.poll();
        queue.peek();
        queue.add(new Person());
        boolean isCapacityOversize = queue.offer(new Person());
    }

    public static void dequeExample() {
        Deque<Person> deque = new ArrayDeque<>();

        deque.add(new Person());
        boolean isOffered = deque.offer(new Person());
//        deque.addLast();
        deque.pop();
    }
}
