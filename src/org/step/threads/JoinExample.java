package org.step.threads;

public class JoinExample {

    public static void main(String[] args) {
        NewThread first = new NewThread("First");
        NewThread second = new NewThread("Second");
        NewThread third = new NewThread("Third");
        System.out.println(first.t.isAlive());
        System.out.println(second.t.isAlive());
        System.out.println(third.t.isAlive());
        try {
            System.out.println("Waiting all threads to finish");
            first.t.join();
            second.t.join();
            third.t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(first.t.isAlive());
        System.out.println(second.t.isAlive());
        System.out.println(third.t.isAlive());
        System.out.println("Main thread exiting.");
    }

    static class NewThread implements Runnable {
        final String name;
        final Thread t;

        public NewThread(String name) {
            this.name = name;
            t = new Thread(this, this.name);
            System.out.println("New thread: " + t);
            t.start();
        }

        @Override
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(name + ": " + i);
                    // ms
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
            System.out.println(name + " exiting.");
        }
    }
}
