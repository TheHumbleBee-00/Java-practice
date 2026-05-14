package libraryinfo;
public class BookFine{
	int rollNo;
	int daysLate;
	int finePerDay;
	public void accept(int rollNo, int daysLate, int finePerDay){
		this.rollNo = rollNo;
		this.daysLate = daysLate;
		this.finePerDay = finePerDay;
	}
	int cal(){
		return daysLate * finePerDay;
	}
	public void display(){
		System.out.println("Pay fine of: "+ cal());
	}
}