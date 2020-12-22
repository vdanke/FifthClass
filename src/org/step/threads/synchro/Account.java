package org.step.threads.synchro;

public class Account {

    private int amount;
//    private Object lock = new Object();

    public Account(int amount) {
        this.amount = amount;
    }

    public void deposit(int increase) {
//        synchronized (this) {
        int result = this.amount + increase;
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.amount = result;
//        }
    }

    public void withdraw(int decrease) {
//        synchronized (this) {
        int result = this.amount - decrease;
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.amount = result;
//        }
    }

    public int getAmount() {
        return amount;
    }
}
