package bankingsystem;

public abstract class Account {

	protected String accountNumber;
	protected double balance;
	
	public Account(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		Bank.incrementAccount();
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract  double getBalance();
	
	public void displayAccountInfo() {
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
