package Lab7Package;

/**
 * @param Account.java
 * Account class. This is a parent class that cannot be instantiated. It contains general information for currency accounts
 * so that it can be extended and specialized.
 * @author Brad Oake
 * @version 1.0
 */
public abstract class Account 
{
	protected String holder;
	protected long number;
	protected float rate;
	
	public Account(String holder, long number, float rate)
	{
		setHolder(holder);
		setNumber(number);
		setRate(rate);
	}
	
	public abstract String getAccountInfo();
	
	public String getHolder() 
	{
		return holder; 
	}
	public void setHolder(String holder) 
	{
		this.holder = holder;
	}
	public long getNumber() 
	{
		return number;
	}
	public void setNumber(long number) 
	{
		this.number = number;
	}
	public float getRate() 
	{
		return rate;
	}
	public void setRate(float rate) 
	{
		this.rate = rate;
	}
}
