package Lab7Package;
import java.text.DecimalFormat;

/**
 * @param AccountTester.java
 * Simple program to demonstrate CreditCard and BankAccount classes.
 * @author Brad Oake
 * @version 1.0
 */

public class AccountTester 
{
	public static void main(String args[])
	{ 
		
		BankAccount savingsAccount = new BankAccount("Dude Bro", 100464760, 0.07f, 10000, "Savings");
		BankAccount chequingAccount = new BankAccount("Alternative Dude Bro", 100464761, 0.08f, 15000, "Chequing");
		CreditCard creditCard1 = new CreditCard("Brad Oake", 238848383, 0.24f, 12, 2014, 1000, 500);
		CreditCard creditCard2 = new CreditCard("Some Dude", 931248102, 0.30f, 12, 2014, 5000, 4000);
		DecimalFormat currency = new DecimalFormat("$#,##0.00");
		
		System.out.println("\n" + savingsAccount.getAccountInfo());
		System.out.println("savingsAccount.calculateInterest(): " + currency.format(savingsAccount.calculateInterest()));
		
		System.out.println("\n" + chequingAccount.getAccountInfo());
		System.out.println("chequingAccount.calculateInterest(12): " + currency.format(chequingAccount.calculateInterest(2)));
				
		System.out.println("\n" + creditCard1.getAccountInfo());
		System.out.println("creditCard1.calculateInterest(): " + currency.format(creditCard1.calculateInterest()));
		System.out.println("creditCard1.calculateInterest(2): " + currency.format(creditCard1.calculateInterest(2)));
		
		System.out.println("\n" + creditCard2.getAccountInfo());
		System.out.println("creditCard2.calculateInterest(): " + currency.format(creditCard2.calculateInterest()));
		System.out.println("creditCard2.calculateInterest(2): " + currency.format(creditCard2.calculateInterest(2)));
	}
}
