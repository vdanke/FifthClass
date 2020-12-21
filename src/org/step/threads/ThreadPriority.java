package org.step.threads;

import org.step.threads.creation.Talk;

public class ThreadPriority {

    // MAX_PRIORITY = 10, MIN_PRIORITY = 1
    public static void main(String[] args) {
//        Thread thread = Thread.currentThread();
//        int priority = thread.getPriority();
//        System.out.printf("Main Thread priority: %d%n", priority);
//        Talk talk = new Talk("ImportantThread~");
//        talk.setPriority(Thread.MAX_PRIORITY);
//        System.out.printf("ImportantThread priority: %d%n", talk.getPriority());
        example();
    }

    public static void example() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker();
        Clicker lo = new Clicker();
        hi.setPriority(Thread.NORM_PRIORITY + 2);
        lo.setPriority(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        lo.stopClick();
        hi.stopClick();
        try {
            hi.join();
            lo.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }

    static class Clicker extends Thread {
        int click = 0;
        private volatile boolean running = true;

        public Clicker() {
        }

        public void run() {
            while (running) {
                click++;
            }
        }

        public void stopClick() {
            running = false;
        }
    }
}
