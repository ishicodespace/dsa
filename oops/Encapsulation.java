package oops;

class BankAccount {
    // private data member
    private int balance;

    // constructor to initialize balance
    BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // public method to get balance
    int getBalance() {
        return balance;
    }

    // public method to deposit money
    public void deposit(int amount) {
        updateBalance(amount);

    }

    // private method that updates balance that cannot be accessed by the user
    private void updateBalance(int amount) {
        balance += amount;
        System.out.println("balance updated" + balance);
    }
}

public class Encapsulation {
    // wrapping data members and methods in a single unit is called encapsulation
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.deposit(900);
    }
}
