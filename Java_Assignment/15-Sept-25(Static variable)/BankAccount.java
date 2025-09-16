import java.util.Scanner;

class Account
{
	int account_no;
   	String name;
   	double balance;
	static double intrestRate;

	static
	{	
		intrestRate = 5;
	}

	//setters

   void setName(String name)
	{
          this.name = name;
        }

   void setAccount_no(int account_no)
	{
          this.account_no= account_no;
      }
    
	void setBalance(double balance)
	{
          this.balance = balance;
      	}

	//getters
    	
	String getName()
	{
          return this.name;
     	 }
  
   	int getAccount_no()
	{
          return this.account_no;
      	}
    	
 	double getBalance()
	 {
          return this.balance;
         }
	
	static double setIntrestRate(int i ) //static function change variable name
	{
           intrestRate = i;                  // remove this keyword
      	}
   
       Account()
     {
          
       this.name = "Rutika";
       this.account_no= 101;
       this.balance = 100000;
       this.intrestRate = 5.5;
      }
	
     Account(String name,int accountNo, double balance)
	{
          
       this.name = name;
       this.account_no= accountNo;
       this.balance = balance;
      }

      void display()
	{
          System.out.println("Name: "+ this.name);
          System.out.println("Account Number: "+ this.account_no);
          System.out.println("Balance: "+ this.balance);
	  System.out.println("IntrestRate: "+ this.intrestRate);	
      }
}

class BankAccount
{
  public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);   
   /*
        System.out.println("Enter Name: ");
        String b= sc.nextLine();

        System.out.println("Enter Account Number: ");
        int a= sc.nextInt();
        
	System.out.println("Enter Balance: ");
        double b1= sc.nextDouble();
  */
	//System.out.println("Enter IntrestRate: ");
        //double h= sc.nextDouble();

       //Account ac= new Account(b,a, b1,h);    

	Account ac= new Account("rutika",101,100000);
		System.out.println("");
	Account ac1= new Account("raju",103,200000); 		
 		
        ac.display();
	ac1.display();
   	
	Account.setIntrestRate(4);
	ac.display();
	ac1.display();	

     }
}