import java.util.*;

interface Payable{
	double calculateAmount();
}
 class ParkingVehicle{
	String vehicleNumber;
	int baseFee;
	
	void accept(String vehicleNumber, int baseFee){
		this.vehicleNumber = vehicleNumber;
		this.baseFee = baseFee;
	}
	void display(){
		System.out.println("Vehicle number: "+vehicleNumber);
		System.out.println("Base Fee: " + baseFee);
	}
}
class CarPark extends ParkingVehicle implements Payable{
	int hoursParked;
	int hourlyRate;
	void acceptParking(int hoursParked, int hourlyRate){
		this.hoursParked = hoursParked;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateAmount(){
		return super.baseFee + hoursParked*hourlyRate;
	}
}
public class Main1{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		CarPark obj = new CarPark();
		
		System.out.println("Enter vehicle number: ");
		String number = sc.nextLine();
		
		System.out.println("Enter base fees, hours parked , hourly rate");
		int b = sc.nextInt();
		int hp = sc.nextInt();
		int hr = sc.nextInt();
		
		obj.accept(number , b);
		obj.acceptParking(hp,hr);
		
		obj.display();
		
		System.out.println("Hours Parked: "+obj.hoursParked);
		System.out.println("Hourly Rate: "+obj.hourlyRate);
		
		System.out.println(" Amount: "+obj.calculateAmount());
	}
}	