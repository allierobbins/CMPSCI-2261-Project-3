package robbinsProject3;

public class robbinsProject3 {
	//main class for project 3
	
	public static void main(String[] args) {
	
		//creation of Account object
		System.out.println("Creating new Account Object.");
		Account a1 = new Account(1122, 20000);

		//setting annual interest rate to 4.5%
		a1.setAnnualInterestRate(.045);
		
		//withdrawing 2500 from balance
		System.out.println("Withdrawing $2,500 from object.");
		a1.withdraw(2500);
		
		//depositing 3000 to balance
		System.out.println("Depositing $3,000 from object.");
		a1.deposit(3000);
		
		//printing information of object
		System.out.println("\nBalance is " + a1.getBalance());
		System.out.println("Monthly interest is " + a1.getMonthlyInterest());
		System.out.println("This account was created at " + a1.getDateCreated());
}
}