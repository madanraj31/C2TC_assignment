package bankingsystem;

public class Bank {

private static int totalAccounts=0;
	
	
	public static void incrementAccount() {
		totalAccounts++;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
}
