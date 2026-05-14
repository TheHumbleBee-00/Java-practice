import java.util.*;
public class RoomPaint{
	int length;
	int breadth;
	int height;
	
	RoomPaint(int lenght, int breadth){
		this.length = length;
		this.breadth = breadth;
		this.height = 3;
	}
	double wallArea(){
		return 2 * height * (length + breadth);
	}
	double paintCost(double ratePerSquareMete){
		return wallArea() * ratePerSquareMete;
	}
	void display(double ratePerSquareMete){
		System.out.println("Area of wall= " + wallArea());
		System.out.println("Total paint cost= "+paintCost(ratePerSquareMete));
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter paint rate: ");
		double r = sc.nextDouble();
		
		RoomPaint obj = new RoomPaint(l,b);
		obj.display(r);
	}
}