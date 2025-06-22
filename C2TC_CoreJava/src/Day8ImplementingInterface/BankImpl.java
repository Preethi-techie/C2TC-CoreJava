package Day8ImplementingInterface;

public class BankImpl{
 public static void main(String[] args) {
     // Create a Bank instance
     BankImpl bank = new BankImpl();

     // Create an Account
     Account account = new Account(123456, "Mihir", 155000, bank);

     // Deposit money
     account.deposit(2000);
     // Print the account details
     System.out.println(account);
     
     //withdraw money
     account.withdraw(10000);
     // Print the account details
     System.out.println(account);
 }

public void deposit(Account account, double amount) {
	// TODO Auto-generated method stub
	
}

public void withdraw(Account account, double amount) {
	// TODO Auto-generated method stub
	
}
}