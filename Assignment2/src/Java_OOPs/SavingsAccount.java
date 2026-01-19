package Java_OOPs;

public class SavingsAccount extends Account{
 private final double interest=5;
 public SavingsAccount(String name, String accNo, double accountbalance) {
     super(name, accNo, accountbalance);
 }
 public double getBalance() {
	 double balance=getAccBal();
     return balance + (balance * interest / 100);
 }
 @Override
 public void withdraw(double amount) {
     double balance=getAccBal();
     if (amount > balance) {
         System.out.println("Withdrawal exceeds available balance");
         return;
     }
     if (balance - amount < 5000) {
         System.out.println("Minimum balance of ₹5000 must be maintained");
         return;
     }
     balance -= amount;
     System.out.println("Withdrawal successful: ₹" + amount);
 }
}
