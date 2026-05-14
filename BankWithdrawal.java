import java.util.*;
public class BankWithdrawal{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		try{
			System.out.println("Enter balance and withdrawal amt");
			int balance = sc.nextInt();
			int withdrawal = sc.nextInt();
			
			if( balance < 0 || withdrawal <= 0){
				throw new IllegalArgumentException ("Invalid");
			}
			if(withdrawal > balance){
				throw new ArithmeticException ("Insufficient Balance");
			}
			
			System.out.println("Remaining balance: " + (balance - withdrawal));
		}
		catch ( IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		catch ( ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Banking done");
		}
	}
}