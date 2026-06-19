package exercise1;

public class AccountType {

	public static final int REGULAR_ACCOUNT = 0;
	public static final int PREMIUM_ACCOUNT = 1;
	
	private int accountType;
	
	public boolean isPremium() {
		if (this.accountType == PREMIUM_ACCOUNT)
			return true;
		return false;
	}

	public double overdraftCharge(int daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
	    }
	    else {
	    	return daysOverdrawn * 1.75;
	    }
	}
	
	// Consider there is additional code here...

}
