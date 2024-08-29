class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Current balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ", but only " + balance + " is available.");
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;

    public DepositThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(200);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;

    public WithdrawThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(150);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        DepositThread dt1 = new DepositThread(account, "DepositThread-1");
        WithdrawThread wt1 = new WithdrawThread(account, "WithdrawThread-1");
        DepositThread dt2 = new DepositThread(account, "DepositThread-2");
        WithdrawThread wt2 = new WithdrawThread(account, "WithdrawThread-2");

        dt1.start();
        wt1.start();
        dt2.start();
        wt2.start();

        try {
            dt1.join();
            wt1.join();
            dt2.join();
            wt2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
