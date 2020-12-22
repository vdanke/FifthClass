package org.step.threads.synchro;

public class OperatorWithdraw extends Thread {
    private Account account;
    private int amount;

    public OperatorWithdraw(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (account) {
                account.withdraw(amount);
            }
        }
    }
}
