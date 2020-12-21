package org.step.threads;

public class DaemonExample {

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is done");
    }
    /*
    -----MEMORY GC (STACK)-----
    JVM (HEAP && STACK)

    ----MEMORY (STACK) --- |
            -----MEMORY (STACK) Daemon ----
     */
    static class DaemonThread extends Thread {

        @Override
        public void run() {
            int i = 0;
            while (i < 10) {
                System.out.printf("Index: %d%n", i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
}
