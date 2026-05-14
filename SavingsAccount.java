import java.util.*;
public class SavingsAccount{
	
	private double principle;
	private double rate;
	private double years;
	
	boolean setPrinciple(double principle){
		if(principle > 0){
			this.principle = principle;
			return true;
		}
		return false;
	}
	boolean setRate(double rate){
		if(rate > 0){
			this.rate = rate;
			return true;
		}
		return false;
	}
	boolean setYears(double years){
		if(years > 0){
			this.years = years;
			return true;
		}
		return false;
	}
	
	double getPrinciple(){
		return principle;
	}
	double getRate(){
		return rate;
	}
	double getYears(){
		return years;
	}
	
	double simpleInterest(){
		return principle*rate*years/100;
	}
	double maturityAmount(){
		return principle + simpleInterest();
	}
	
	void display(){
		System.out.println("Interest: "+simpleInterest());
		System.out.println("Maturity Amount: "+maturityAmount());
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		SavingsAccount obj = new SavingsAccount();
		
		System.out.println("Enter principle, rate, years: ");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int y = sc.nextInt();
		
		boolean vPrinciple = obj.setPrinciple(p);
		boolean vRate = obj.setRate(r);
		boolean vYears = obj.setYears(y);
		
		if ( vPrinciple && vRate && vYears){
			System.out.println("Principle: "+obj.getPrinciple());
			System.out.println("Rate: " + obj.getRate());
			System.out.println("Years: "+obj.getYears());
			
			obj.display();
		}
		else
			System.out.println("Invalid");
	}
}