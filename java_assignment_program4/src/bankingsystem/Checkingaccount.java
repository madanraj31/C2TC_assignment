package bankingsystem;

public class Checkingaccount extends Account {
	
private double overdraftLimit = 5000;
	

    public Checkingaccount(String accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
	
}
