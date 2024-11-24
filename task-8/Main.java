// Defining the BankAccount interface
interface BankAccount {
    // Method to deposit money
    void deposit(double amount);

    // Method to withdraw money
    void withdraw(double amount);
}

// Implementing the CheckingAccount class that implements BankAccount
class CheckingAccount implements BankAccount {
    private double balance;

    // Constructor to initialize balance to 0
    public CheckingAccount() {
        balance = 0.0;
    }

    // Implementing the deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implementing the withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to test the CheckingAccount implementation
public class Main {
    public static void main(String[] args) {
        // Creating an object of CheckingAccount
        CheckingAccount account = new CheckingAccount();

        // Deposit some money
        account.deposit(5000);

        // Withdraw some money
        account.withdraw(2000);

        // Try to withdraw more than available balance
        account.withdraw(4000);

        // Display the final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
