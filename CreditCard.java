package Lab7Package;
import java.text.*;
import java.util.*;

/**
 * @param CreditCard.java
 * Creating a basic credit card class. Learn the fundamentals of attributes, class variables, constructors, and class methods
 * in Java.
 * @author Brad Oake
 * @version 1.0
 */

public class CreditCard extends Account implements InterestInterface
{
	
	public final static int DEFAULT_INTEREST_PERIOD = 30;
	
	//ATTRIBUTES OR FIELDS
	private int month;
	private int year;
	private float limit;
	private float balance;

	//CLASS VARIABLES
	static public final long ACCOUNT_NUMBER_LENGTH = 16;
	
	
	//CONSTUCTORS
	public CreditCard(String holder, long number, float rate, int month, int year, float limit, float balance)
	{
		super(holder, number, rate);
		setMonth(month);
		setYear(year);
		setLimit(limit);
		setBalance(balance);
		
	}
	
	//METHODS
	public void displayCardInfo()
	{
		displayCardInfo(0);
	}
	
	@Override
	public String getAccountInfo() 
	{
		String output = "";
		output += "Credit Card Info\nHolder:\t\t\t";
		output += getHolder();
		output += "\nAcct Number:\t\t";
		output += getNumber();
		output += "\nExpiry Date:\t\t" + getMonth() + "/" + getYear();
		output += "\nInterest rate:\t\t";
		NumberFormat nfRate = new DecimalFormat("0.##%");
		output += nfRate.format(rate);
		output += "\nBalance:\t\t";
		NumberFormat nfBalance = new DecimalFormat("$#########0.00");
		output += nfBalance.format(getBalance());
		output += "\nLimit:\t\t\t";
		output += nfBalance.format(getLimit());
		return output;
	}
	
	@Override
	public float calculateInterest(int days) 
	{
		return (float)(getBalance() * Math.pow((1 + (getRate()/MONTHS_IN_YEAR)), days/DAYS_IN_MONTH)) * (1 + getRate()/DAYS_IN_YEAR*(days % DAYS_IN_MONTH)) - getBalance();
	}
	public float calculateInterest() 
	{
		return this.calculateInterest(DEFAULT_INTEREST_PERIOD);
	}
	
	public void displayCardInfo(float balanceChange)
	{
		NumberFormat monthFormatter = new DecimalFormat("00");
		System.out.println("Card Holder Name: " + getHolder());
		System.out.println("Account Number: " + getNumber());
		System.out.println("Month/year: " + monthFormatter.format(getMonth()) + "/" + monthFormatter.format(getYear()));
		setBalance(getBalance() + balanceChange);
		System.out.println("Balance: " + NumberFormat.getCurrencyInstance(Locale.CANADA));
	}
	
	public boolean verifyAccountNumber()
	{
		boolean isValid = false;
		String unverifiedAccountNumber = String.valueOf(getNumber());
		
		if(unverifiedAccountNumber.length() == ACCOUNT_NUMBER_LENGTH)
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public float getLimit() 
	{
		return limit;
	}

	public void setLimit(float limit) 
	{
		this.limit = limit;
	}

	public float getBalance() 
	{
		return balance;
	}

	public void setBalance(float balance) 
	{
		this.balance = balance;
	}
}
