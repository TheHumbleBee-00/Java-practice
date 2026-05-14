package payroll;
public class SalarySlip{
	int empID;
	double basic;
	double hra;
	double da;
	
	public void accept(int empID, double basic, double hra, double da){
		this.empID=empID;
		this.basic=basic;
		this.hra=hra;
		this.da=da;
	}
	double calculate(){
		return basic+hra+da;
	}
	public void display(){
		System.out.println("The gross salary = " + calculate());
	}
}
