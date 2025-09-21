class Account {
     int accNo;
     String holderName;
     double balance;

     Account(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

     int getAccNo() 
    { 
    	return accNo; 
    }
     void setAccNo(int accNo) 
    { 
    	this.accNo = accNo; 
    }

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

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
    
    void Message() 
    {
        System.out.println("This is account class");
    }
    
}

class SavingsAccount extends Account {
     double interestRate;

    SavingsAccount(int accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
    }

    double getInterestRate() 
    { 
    	return interestRate;
    }
    void setInterestRate(double interestRate) 
    { 
    	this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
    void Message() 
    {
        System.out.println("This is SavingsAccount class");
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

     void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
    
     void Message() 
     {
         System.out.println("This is CurrentAccount class");
     }
}

 class BankDetails {
    public static void main(String[] args) {
    	 Account a ;
    	 a = new  Account(1021,"Mansi",100);
    	 a.display();
    	 System.out.println();
    	 
    	 a = new SavingsAccount(101, "Ritika", 50000, 4.5);
    	 a.display();
    	 System.out.println();
    	 
    	 a = new CurrentAccount(102, "Amit", 100000, 25000);
    	 a.display();
    	 System.out.println();
       
        System.out.println("-------------------");
       
    }
}
