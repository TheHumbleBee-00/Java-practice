import java.util.*;
public class CourierPackage{
	private double weight;
	private double distance;
	
	boolean setWeight(double weight){
		if(weight > 0){
			this.weight = weight;
			return true;
		}
		return false;
	}
	boolean setDistance(double distance){
		if(distance > 0){
			this.distance = distance;
			return true;
		}
		return false;
	}
	
	double getWeight(){
		return weight;
	}
	double getDistance(){
		return distance;
	}
	double calculateCharge(){
		return 50 + weight * distance * 0.75;
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		CourierPackage obj = new CourierPackage();
		
		System.out.println("Enter weight: ");
		double w = sc.nextDouble();
		System.out.println("Enter Distance: ");
		double d = sc.nextDouble();
		
		boolean validWeight = obj.setWeight(w);
		boolean validDist = obj.setDistance(d);
		
		if(validWeight && validDist){
			System.out.println("Weight= "+obj.getWeight());
			System.out.println("Distance+ "+obj.getDistance());
			System.out.println("Charge = " + obj.calculateCharge());
		}
		else
			System.out.println("Invalid Input");
	}
}