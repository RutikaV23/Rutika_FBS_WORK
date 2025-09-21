class Account {
     int accNo;
     String holderName;
     double balance;

     Account(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    int getAccNo() { return accNo; }
     void setAccNo(int accNo) { this.accNo = accNo; }

     String getHolderName() 
    { 
        return holderName;
    }
     void setHolderName(String holderName) 
    { 
        this.holderName = holderName; 
    }

     double getBalance() 
    { 
        return balance; 
    }
     void setBalance(double balance) 
    { 
        this.balance = balance; 
    }

     void displayAccount() 
    {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
     double interestRate;

     SavingsAccount(int accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
    }

    double getInterestRate() { return interestRate; }
     void setInterestRate(double interestRate) { this.interestRate = interestRate; }

     void displaySavings() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
     double overdraftLimit;

     CurrentAccount(int accNo, String holderName, double balance, double overdraftLimit) {
        super(accNo, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

     double getOverdraftLimit() 
    { 
        return overdraftLimit; 
    }
     void setOverdraftLimit(double overdraftLimit) 
    { 
        this.overdraftLimit = overdraftLimit; 
    }

     void displayCurrent() 
    {
        displayAccount();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

 class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Ritika", 50000, 4.5);
        CurrentAccount ca = new CurrentAccount(102, "Amit", 100000, 25000);

        sa.displaySavings();
        System.out.println("-------------------");
        ca.displayCurrent();
    }
}

