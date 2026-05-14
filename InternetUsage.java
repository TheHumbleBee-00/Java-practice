import java.util.*;
public class InternetUsage{
	private int previousGB;
	private int currentGB;
	
	InternetUsage(){
		previousGB = 0;
		currentGB = 0;
	}
	InternetUsage(int previousGB, int currentGB){
		this.previousGB = previousGB;
		this.currentGB = currentGB;
	}
	boolean isValid(){
		return previousGB>0 && currentGB>0 && currentGB>previousGB;
	}
	int calculateData(){
		return currentGB - previousGB;
	}
	double bill(){
		return calculateData()*12.50;
	}
	void display(){
		System.out.println("Data used: "+calculateData());
		System.out.println("Bill: "+bill());
	}
	
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter previous and current GB");
		int p = sc.nextInt();
		int c = sc.nextInt();
		
		InternetUsage obj = new InternetUsage(p,c);
		
		if(obj.isValid()){
			obj.display();
		}
		else
			System.out.println("invalid");
	}
}