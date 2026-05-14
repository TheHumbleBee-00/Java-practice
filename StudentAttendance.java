import java.util.*;
public class StudentAttendance{
	private int attendedClasses;
	private int totalClasses;
	
	boolean setTotalClasses(int totalClasses){
		if(totalClasses > 0){
			this.totalClasses = totalClasses;
			return true;
		}
		return false;
	}
	boolean setAttendedClasses(int attendedClasses){
		if(0 <= attendedClasses && attendedClasses <=totalClasses){
			this.attendedClasses = attendedClasses;
			return true;
		}
		return false;
	}
	int getAttendedClasses(){
		return attendedClasses;
	}
	int getTotalClasses(){
		return totalClasses;
	}
	double attendancePercentage(){
		return (attendedClasses * 100) / totalClasses;
	}
	boolean isEligible(){
		return attendancePercentage() >= 75;
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		StudentAttendance obj = new StudentAttendance();
		
		System.out.println("Enter total classes");
		int total = sc.nextInt();
		System.out.println("Enter attended classes: ");
		int attended = sc.nextInt();
		
		boolean vTotal = obj.setTotalClasses(total);
		boolean vAttended = obj.setAttendedClasses(attended);
		
		if( vTotal && vAttended){
			System.out.println("Attended classes: "+obj.getAttendedClasses());
			System.out.println("Total Classes: "+obj.getTotalClasses());
			System.out.println("Attendance percentage: "+obj.attendancePercentage());
			
			if(obj.isEligible()){
				System.out.println("Eligible");
			}
			else
				System.out.println("NOT");
		}
		else
			System.out.println("Invalid");
	}
}