package accounts;

import java.time.LocalDate;
//Salary Account
public class SalaryAccount extends BankAccount {
	private LocalDate salaryDate;
	private String lastTransactionDate;

  
  public SalaryAccount() {
      super();
      this.salaryDate = LocalDate.now();
      this.lastTransactionDate = "not define";
  }
  
 public SalaryAccount(String accNo, String name, double bal, String lastTransactionDate) {
     super(accNo, name, bal);
     this.salaryDate = LocalDate.now();
     this.lastTransactionDate = lastTransactionDate;
 }

 // Getters & Setters

 public String getLastTransactionDate() {
     return lastTransactionDate;
 }

 public void setLastTransactionDate(String lastTransactionDate) {
     this.lastTransactionDate = lastTransactionDate;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Salary Date: " + salaryDate);
     System.out.println("Last Transaction Date: " + lastTransactionDate);
 }
}

