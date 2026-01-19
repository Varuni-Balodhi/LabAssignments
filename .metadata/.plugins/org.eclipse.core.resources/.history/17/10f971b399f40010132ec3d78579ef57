package Java_OOPs;

public class CurrentAccount extends Account {
	private String tradeLicenseNumber;
    private double overdraft;
    public CurrentAccount(String name, String accountNumber, double accountbalance,
                          String tradeLicenseNumber, double overdraft) {
    	
        super(name,accountNumber, accountbalance);
        this.tradeLicenseNumber = tradeLicenseNumber;
        this.overdraft = overdraft;
    }
    public double getBalance() {
    	double accountBalance=getAccBal();
        return accountBalance;
    }
    @Override
    public void withdraw(double amount) {
        double accountBalance=getAccBal();
        if (amount <= accountBalance + overdraft) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful: ₹" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}
