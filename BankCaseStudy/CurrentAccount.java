package accounts;

//Current Account
public class CurrentAccount extends BankAccount {
 private double overdraftLimit = 5000;
 private int transactionLimit = 10;
 private int transactions ;

 
 public CurrentAccount() {
     super();
 }
 
 public CurrentAccount(String accNo, String name, double bal) {
     super(accNo, name, bal);
 }

 // Getters & Setters
 public double getOverdraftLimit() {
     return overdraftLimit;
 }

 public int getTransactionLimit() {
     return transactionLimit;
 }

 public int getTransactions() {
     return transactions;
 }

 public void setTransactions(int transactions) {
     this.transactions = transactions;
 }
 
 public int getTransactions(int transactions)
 {
    return transactions;
 }

 @Override
 public void withdraw(double amount) {
     if (transactions >= transactionLimit) {
         System.out.println("❌ Transaction limit reached (" + transactionLimit + ")");
         return;
     }

     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         transactions++;
         System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance +
                 " | Transactions: " + transactions);
     } else {
         System.out.println("❌ Overdraft limit exceeded!");
     }
 }
}

