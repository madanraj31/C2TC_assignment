package bankingsystem;

public class BankingSystemDemo {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount("S001", 1000);
        Checkingaccount ca = new Checkingaccount("C001", 2000);

        Transaction transaction = new Transaction();

        // Perform transactions
        transaction.performTransaction(sa, 500, true);  // Deposit
        transaction.performTransaction(sa, 200, false); // Withdraw

        transaction.performTransaction(ca, 1000, false); // Withdraw
        transaction.performTransaction(ca, 2000, true);  // Deposit

        // Show total accounts created
        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());
	}

}
