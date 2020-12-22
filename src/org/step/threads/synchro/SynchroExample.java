package org.step.threads.synchro;

public class SynchroExample {

    /*
    A && B
    | /
    C
     */

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(200);
        OperatorWithdraw withdraw = new OperatorWithdraw(account, 50);
        OperatorDeposit deposit = new OperatorDeposit(account, 100);

        withdraw.start();
        deposit.start();

        withdraw.join();
        deposit.join();

        System.out.println(account.getAmount());
    }
}
