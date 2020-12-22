package org.step.threads.synchro;

public class OperatorDeposit extends Thread {
    private Account account;
    private int deposit;

    public OperatorDeposit(Account account, int deposit) {
        this.account = account;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (account) {
                account.deposit(deposit);
            }
        }
    }
}
