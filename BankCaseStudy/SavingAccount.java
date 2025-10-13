package accounts;

//Saving Account
public class SavingAccount extends BankAccount {
 private double minBalance = 2000;

 
 public SavingAccount() {
     super();
     this.minBalance = 0;
 }
 
 public SavingAccount(String accNo, String name, double bal) {
     super(accNo, name, bal);
    
 }

 // Getter & Setter
 public double getMinBalance() {
     return minBalance;
 }

 public void setMinBalance(double minBalance) {
     this.minBalance = minBalance;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= minBalance) {
         balance -= amount;
         System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
     } else {
         System.out.println("❌ Cannot withdraw! Minimum balance should be ₹" + minBalance);
     }
 }
}
