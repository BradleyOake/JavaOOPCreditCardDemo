package Lab7Package;
import java.text.DecimalFormat;

/**
 * @param InterestInterface.java
 * 
 * @author Brad Oake
 * @version 1.0 
 */

public interface InterestInterface
{
	final static int DAYS_IN_MONTH = 30;
	final static int DAYS_IN_YEAR = 360;
	final static int MONTHS_IN_YEAR = 12;
	public static DecimalFormat currency = new DecimalFormat("$#,##0.00");
	public float calculateInterest(int numberOfPeriods);
}
