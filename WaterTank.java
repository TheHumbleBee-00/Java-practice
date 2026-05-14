import java.util.*;
public class WaterTank{
	
	int capacity;
	int currentWater;
	void accept(int capacity, int currentWater){
		this.capacity = capacity;
		this.currentWater = currentWater;
	}
	int waterReq(){
		return capacity - currentWater;
	}
	double per(){
		return (currentWater * 100)/capacity;
	}

	void display(){
		System.out.println("Required Water =" + waterReq());
		System.out.println("Percentage filled+ " + per());
	}
	public static void main (String args[]){
		WaterTank obj = new WaterTank();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter capacity of Tank: ");
		int cap = sc.nextInt();
		System.out.println("Enter current water level: ");
		int cur = sc.nextInt();
		obj.accept(cap,cur);
		obj.display();
	}
}