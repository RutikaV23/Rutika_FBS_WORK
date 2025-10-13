// FinalReport
package bank1;

class FinalReport 
{
    private int noOfAccounts;
    private int countOfAccounts;
    private double depositedAmount;
    private double withdrawnAmount;
    private int totalTransactions;

    // Getters & Setters
    public int getNoOfAccounts() 
    {
    	return noOfAccounts; 
    }
    public void setNoOfAccounts(int noOfAccounts) 
    { 
    	this.noOfAccounts = noOfAccounts; 
    }

    public int getCountOfAccounts() 
    { 
    	return countOfAccounts; 
    }
    
    public void setCountOfAccounts(int countOfAccounts) 
    { 
    	this.countOfAccounts = countOfAccounts; 
    }

    public double getDepositedAmount() 
    { 
    	return depositedAmount; 
    }
    public void setDepositedAmount(double depositedAmount) 
    { 
    	this.depositedAmount = depositedAmount; 
    }

    public double getWithdrawnAmount() 
    { 
    	return withdrawnAmount; 
    }
    public void setWithdrawnAmount(double withdrawnAmount) 
    {
    	this.withdrawnAmount = withdrawnAmount; 
    }

    public int getTotalTransactions() 
    { 
    	return totalTransactions; 
    }
    public void setTotalTransactions(int totalTransactions) 
    { 
    	this.totalTransactions = totalTransactions; 
    }
}
