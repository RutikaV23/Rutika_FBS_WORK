// Transaction Class
// -------------------------
package bank1;

class Transaction {
    private int transactionId;
    private String accountNo;
    private double amount;
    private String date;

    public Transaction() {
        this.transactionId = 0;
        this.accountNo = "not define";
        this.amount = 0;
        this.date = "not define";
    }
    
    public Transaction(int transactionId, String accountNo, double amount, String date) {
        this.transactionId = transactionId;
        this.accountNo = accountNo;
        this.amount = amount;
        this.date = date;
    }

    // Getters & Setters
    public int getTransactionId() 
    {
    	return transactionId; 
    }
    
    public void setTransactionId(int transactionId) 
    {
    	this.transactionId = transactionId; 
    }

    public String getAccountNo() 
    {
    	return accountNo; 
    }
    public void setAccountNo(String accountNo) 
    {
    	this.accountNo = accountNo; 
    }

    public double getAmount() 
    {
    	return amount; 
    }
    public void setAmount(double amount) 
    {
    	this.amount = amount; 
    }

    public String getDate() 
    {
    	return date; 
    }
    public void setDate(String date) 
    {
    	this.date = date; 
    }

    // Method
    public void recordTransaction() 
    {
        System.out.println("Transaction Recorded: ID " + transactionId + ", Account: " + accountNo + ", Amount: " + amount + ", Date: " + date);
    }
}
