package accounts;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    // Constructor
    
    public BankAccount() {
        this.accountNumber = "not define";
        this.accountHolderName = "not define";
        this.balance = 0;
    }
    
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Common Methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println(" Insufficient balance!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
    
    
}