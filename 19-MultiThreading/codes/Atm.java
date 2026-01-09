/*
// Without Synchronization
class AtmMachine {

    private double balance;

    public AtmMachine(double balance) {
        this.balance = balance;
    }

     public void checkBalance(String name) {
        System.out.println(name + " checking balance: " + balance);
    }

     public void withdraw(String name, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (balance < amount) {
            System.out.println(name + " - Insufficient balance");
            return;
        }

        System.out.println(name + " withdrawing " + amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        balance -= amount;
        System.out.println(name + " new balance: " + balance);
    }

     public void deposit(String name, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        System.out.println(name + " depositing " + amount);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        balance += amount;
        System.out.println(name + " new balance: " + balance);
    }
}

class Customer extends Thread {

    private final AtmMachine atm;
    private final String name;
    private final double withdrawAmount;
    private final double depositAmount;

    public Customer(String name, AtmMachine atm, double withdrawAmount, double depositAmount) {
        this.name = name;
        this.atm = atm;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }
    public void UseAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, withdrawAmount);
        atm.deposit(name, depositAmount);
    }

    public void run() {
        UseAtm();
    }
}

public class Atm {
    public static void main(String[] args) {

        AtmMachine atm = new AtmMachine(5000);

        Customer c1 = new Customer("Mohit", atm, 2500, 200);
        Customer c2 = new Customer("Rahul", atm, 1000, 100);

        c1.start();
        c2.start();
    }
} */

// With Synchronization
class AtmMachine {

    private double balance;

    public AtmMachine(double balance) {
        this.balance = balance;
    }

    synchronized public void checkBalance(String name) {
        System.out.println(name + " checking balance: " + balance);
    }

    synchronized public void withdraw(String name, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (balance < amount) {
            System.out.println(name + " - Insufficient balance");
            return;
        }

        System.out.println(name + " withdrawing " + amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        balance -= amount;
        System.out.println(name + " new balance: " + balance);
    }

    synchronized public void deposit(String name, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        System.out.println(name + " depositing " + amount);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        balance += amount;
        System.out.println(name + " new balance: " + balance);
    }
}

class Customer extends Thread {

    private final AtmMachine atm;
    private final String name;
    private final double withdrawAmount;
    private final double depositAmount;

    public Customer(String name, AtmMachine atm, double withdrawAmount, double depositAmount) {
        this.name = name;
        this.atm = atm;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }
    public void UseAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, withdrawAmount);
        atm.deposit(name, depositAmount);
    }

    public void run() {
        UseAtm();
    }
}

public class Atm {
    public static void main(String[] args) {

        AtmMachine atm = new AtmMachine(5000);

        Customer c1 = new Customer("Mohit", atm, 2500, 200);
        Customer c2 = new Customer("Rahul", atm, 1000, 100);

        c1.start();
        c2.start();
    }
}

