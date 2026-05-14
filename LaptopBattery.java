import java.util.*;
public class LaptopBattery{
	
	int capacity;
	int currentCharge;
	
	void acceptDetails(int capacity, int currentCharge){
		this.capacity = capacity;
		this.currentCharge = currentCharge;
	}
	int chargeReq(){
		return capacity - currentCharge;
	}
	double per(){
		return (currentCharge*100)/capacity;
	}
	void displayDetails(){
		System.out.println("Capacity: "+capacity);
		System.out.println("Current Charge: "+currentCharge);
		System.out.println("Charge required: "+chargeReq());
		System.out.println("Percentage: "+per());
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Capacity: ");
		int cap = sc.nextInt();
		System.out.println("Enter the Current charge: ");
		int cur = sc.nextInt();
		
		LaptopBattery obj = new LaptopBattery();
		obj.acceptDetails(cap,cur);
		obj.displayDetails();
	}
}