package org.step.threads;

import org.step.threads.creation.Fly;
import org.step.threads.creation.Talk;
import org.step.threads.creation.Walk;

public class ThreadExample {
    // C#{a-a-a-a-a-a-a} -> async a
    // J{} -> async J
    public static void main(String[] args) throws Exception {

    }

    public static void isAliveNameIdThread() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
        thread.setName("MyThread~");
        System.out.println(thread.getName() + " " + thread.getId());
        boolean alive = thread.isAlive();
        if (!alive) {
            // backup
        } else {
            // processing
        }
        Thread.State state = thread.getState();
        if (state.equals(Thread.State.WAITING)) {

        }
    }

    public static void creationExample() throws Exception {
        Talk talk = new Talk("MyThread~");
        talk.start();
        Walk walk = new Walk();
        Thread thread = new Thread(walk);
        thread.start();
        Fly fly = new Fly();
        Integer call = fly.call();
        System.out.println(call);
    }
}
