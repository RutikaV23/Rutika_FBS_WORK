class Account {
    private int accNo;
    private String holderName;
    private double balance;

    public Account(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNo() { return accNo; }
    public void setAccNo(int accNo) { this.accNo = accNo; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void displayAccount() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public void displaySavings() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accNo, String holderName, double balance, double overdraftLimit) {
        super(accNo, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }

    public void displayCurrent() {
        displayAccount();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Ritika", 50000, 4.5);
        CurrentAccount ca = new CurrentAccount(102, "Amit", 100000, 25000);

        sa.displaySavings();
        System.out.println("-------------------");
        ca.displayCurrent();
    }
}
