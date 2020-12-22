package org.step.threads.group;

public class ThreadGroupExample {


    public static void main(String[] args) {
        threadGroupPractice(true);
    }

    public static void threadGroupPractice(boolean isPrinted) {
        ThreadGroup first = new ThreadGroup("FirstThreadGroup");
        first.setMaxPriority(7);
        ThreadGroup second = new ThreadGroup("SecondThreadGroup");
        CustomThread firstThread = new CustomThread(first, "FirstThread");
        CustomThread secondThread = new CustomThread(second, "SecondThread");
        CustomThread thirdThread = new CustomThread(first, "ThirdThread");
        CustomThread fourthThread = new CustomThread(second, "FourthThread");

        if (isPrinted) {
            first.list();
            second.list();
        }
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        first.interrupt();
    }

    /*
    Thread: 9 -> ThreadGroup 7 -> Thread 7
    Thread: 5 -> ThreadGroup 7 -> Thread 5
     */
    public static void threadGroupExample() {
        ThreadGroup first = new ThreadGroup("MyThreadGroup~");
        int activeCount = first.activeCount();
        int groupOfThread = first.activeGroupCount();

        first.list();

        Thread thread = Thread.currentThread();

        first.checkAccess();
        first.destroy();
        boolean isDestroyed = first.isDestroyed();
        int maxPriority = first.getMaxPriority();
        ThreadGroup parent = first.getParent();
        first.interrupt();
    }

    public static class CustomThread extends Thread {

        public CustomThread(ThreadGroup group, String name) {
            super(group, name);
            System.out.println("New thread: " + this);
            this.start();
        }

        @Override
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(getName() + ": " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.printf("Exception %s in " + getName() + "%n", e.getClass().getSimpleName());
            }
            System.out.println(getName() + " exiting.");
        }
    }
}
