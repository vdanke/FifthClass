package org.step.threads.vol;

public class VolatileExample {

    public static void main(String[] args) throws InterruptedException {
        Clicker clicker = new Clicker();
        clicker.start();
        Thread.sleep(100);
        clicker.stopClick();
        clicker.join();
        System.out.println("Click: " + clicker.click);
    }

    public static class Clicker extends Thread {
        private int click;
        private volatile boolean running = true;

        public Clicker() {
        }

        @Override
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
