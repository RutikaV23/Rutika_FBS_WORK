package accounts;

//Loan Account
public class LoanAccount extends BankAccount {
private double loanAmount;
private double rateOfInterest = 5.5;

 
 public LoanAccount() {
     super();
     this.loanAmount = 0;
     this.rateOfInterest = 0;
 }
 
 public LoanAccount(String accNo, String name, double loanAmount) {
     super(accNo, name, 0);
     this.loanAmount = loanAmount;
 }

 // Getters & Setters
 public double getLoanAmount() {
     return loanAmount;
 }

 public void setLoanAmount(double loanAmount) {
     this.loanAmount = loanAmount;
 }

 // Custom Method
 public void calculateInterest() {
     double interest = loanAmount * rateOfInterest / 100;
     System.out.println("Interest on loan: ₹" + interest);
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Loan Amount: ₹" + loanAmount);
     System.out.println("Interest Rate: " + rateOfInterest + "%");
 }
}

