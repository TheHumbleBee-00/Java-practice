import java.util.*;
import payroll.SalarySlip;

public class TestSalary{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		SalarySlip obj = new SalarySlip();
		
		System.out.println("Enter empID");
		int e = sc.nextInt();
		System.out.println("Enter basic, hra, da: ");
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double d = sc.nextDouble();
		
		obj.accept(e,b,h,d);
		obj.display();
	}
}