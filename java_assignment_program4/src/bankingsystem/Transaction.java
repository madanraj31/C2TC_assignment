package bankingsystem;

public class Transaction {

	private final double transactionFee = 10.0; // fixed fee for all transactions

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount + transactionFee); // include fee in withdrawal
        }
        System.out.println("Transaction completed. Fee: " + transactionFee);
        System.out.println("Updated Balance: " + account.getBalance());
    }

}
