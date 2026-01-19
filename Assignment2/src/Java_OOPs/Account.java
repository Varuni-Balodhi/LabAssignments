package Java_OOPs;

public class Account {
private String name;
private String accountNumber;
private double accountBalance;
Account(String name,String accountNumber,double accountBalance){
	this.name=name;
	this.accountNumber=accountNumber;
	this.accountBalance=accountBalance;
}
public String getName() {
	return name;
}
public String getAccNum() {
	return accountNumber;
}
public double getAccBal() {
	return accountBalance;
}
public void deposit(double amount) {
	 if(amount>0) {
		 accountBalance=accountBalance+amount;
		 System.out.println("Account Balance deposited");
	 }else {
		 System.out.println("Invalid Balance amount");
	 }
}
public void withdraw(double amount) {
	System.out.println("Withdraw account must be overriden");
}
public void setBalance(double accountBalance) {
	this.accountBalance=accountBalance;
}
public void setName(String name) {
	this.name=name;
}
public void setAccNum(String accountNumber) {
	this.accountNumber=accountNumber;
}
}
