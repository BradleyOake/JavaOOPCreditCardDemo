package Lab7Package;
import java.text.*;

/**
 * @param BankAccount.java
 * A Bank Account that extends account. This class is used for bank accounts, and calculates compound interest
 * @author Brad Oake
 * @version 1.0
 */

public class BankAccount extends Account implements InterestInterface 
{
	private float balance;
	private String type;

	public float getBalance() 
	{
		return balance;
	}

	public void setBalance(float balance) 
	{
		this.balance = balance;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public String getAccountInfo() 
	{
		String output = "";
		output += "Bank Account Info\nHolder:\t\t\t";
		output += getHolder();
		output += "\nAcct Number:\t\t";
		output += getNumber();
		output += "\nAcctType:\t\t";
		output += getType();
		output += "\nInterest rate:\t\t";
		
		NumberFormat nfRate = new DecimalFormat("0.00");
		output += nfRate.format(rate) + "%";
		
		output += "\nBalance:\t\t";
		//NumberFormat nfBalance = new DecimalFormat("$#,##0.00");
		output += currency.format(balance);
		return output;
	}
	
	public float calculateInterest(int months)
	{
		return (float)(getBalance() * Math.pow((1 + getRate()/MONTHS_IN_YEAR), months)) - getBalance();
	}
	public float calculateInterest()
	{
		float calculatedInterest = calculateInterest(1);
		return calculatedInterest;
	}
	
	BankAccount(String holder, long number,float rate, float balance, String type)
	{
		super(holder, number, rate);
		setBalance(balance);
		setType(type);
	}
}
