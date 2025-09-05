package oops;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.deposit(900);

    }
}

class BankAccount {
    private int balance;

    BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

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
