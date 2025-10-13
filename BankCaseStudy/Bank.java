package bank1;
import java.util.*;
import accounts.*;
import transcationRecords.Transaction;

public class Bank {
     String bankName;
     ArrayList<BankAccount> accounts = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

     
     public Bank() 
     
     { 
     	this.bankName = "ABCD"; 
     }
     
    public Bank(String bankName) 
    
    { 
    	this.bankName = bankName; 
    }

    public void menu() {
        int ch;
        do {
            System.out.println("\n🏦 Welcome to " + bankName);
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Transaction History");
            System.out.println("6. Generate End-of-Day Report");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 : addAccount();
                break;
                case 2 : deposit();
                break;
                case 3 : withdraw();
                break;
                case 4 : displayAccounts();
                break;
                case 5 : Transaction.showAll();
                break;
//              case 6 : Report.generate(accounts);
//                break;
                case 7 : System.out.println("👋 Thank you for banking with us!");
                break;
                default : System.out.println("❌ Invalid choice!");
            }
        } while (ch != 7);
    }

    private void addAccount() {
        sc.nextLine();
        System.out.println("\nSelect Account Type: 1.Saving  2.Salary  3.Current  4.Loan");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account No: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        switch (type) {
            case 1 -> {
                System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();
                accounts.add(new SavingAccount(accNo, name, bal));
            }
            case 2 -> {
            	System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();
                System.out.print("Enter lastDate: ");
                String lastDate = sc.nextLine();
                accounts.add(new SalaryAccount(accNo, name, bal,lastDate));
            }
            case 3 -> {
                System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();
//                System.out.print("Enter Overdraft Limit: ");
//                double limit = sc.nextDouble();
                accounts.add(new CurrentAccount(accNo, name, bal));
            }
            case 4 -> {
                System.out.print("Enter Loan Amount: ");
                double loan = sc.nextDouble();
                accounts.add(new LoanAccount(accNo, name, loan));
            }
            default -> System.out.println("Invalid choice!");
        }

        System.out.println("✅ Account created successfully!");
    }

    private BankAccount findAccount(String accNo) {
        for (BankAccount acc : accounts)
            if (acc.getAccountNumber().equals(accNo)) 
            	return acc;
        return null;
    }

    private void deposit() {
        sc.nextLine();
        System.out.print("Enter Account No: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
            Transaction.record(accNo, "Deposit", amt); // record transaction
            System.out.println("✅ Deposit successful!");
        } else System.out.println("❌ Account not found!");
    }

    private void withdraw() {
        sc.nextLine();
        System.out.print("Enter Account No: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
            Transaction.record(accNo, "Withdraw", amt); // record transaction
        } else System.out.println("❌ Account not found!");
    }

    private void displayAccounts() {
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("--------------------------");
        }
    }
}
