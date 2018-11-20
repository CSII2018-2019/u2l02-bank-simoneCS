import java.text.NumberFormat;

public class AccountInfo {
	private String YourName; 
	private String Balance;  
	private double balance; 
	private double limit; 
	private double low; 

	public AccountInfo(double b, String n, double l) {
		// constructs it 
		setBalance(b); 
		setYourName(n); 
		//setLow(l,b); 
	}
	public AccountInfo(double b, String n) {
		setBalance(b); 
		//setLow(100.00,b);
		setYourName(n); 
	}
	
	public AccountInfo(String string, int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	private void setBalance(double b) {
		double money = b; 
		balance = b; 
		NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
		String moneyString = formatter.format(money); 
		System.out.println(moneyString);
	}
	
	public String getBalance() { 
		return Balance; 
	}
	
	private void setYourName(String n) { 
		YourName = n; 
	}
	
	public String getYourName() { 
		return YourName; 
	}
	
	private double setLow(double b, double l ) { 
		if (1 >= 0) { 
			low = 1;
		}
		else { 
			low = (int) 100.00; 
			System.out.println(" Balance can't be negative, defaulting to 100$ ");}
		return l; // just had to add return statement to send
		}
		
		/*public double low {
			return low;
		} 
		
	} */
	public String toString() { 
		return getYourName() + " has " + getBalance() + 
				" and has a resitricition of a lowest balance of " + /*getLow() +*/ 
				" which means you can withdraw a max of " + (balance - limit); 
			
	}

}
