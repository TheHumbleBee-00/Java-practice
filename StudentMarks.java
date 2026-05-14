import java.util.*;
public class StudentMarks{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int marks[] = new int [3];
		try{
			for(int i = 0; i<3; i++){
				marks[i] = sc.nextInt();
				if (marks[i] < 0 || marks[i] > 100)
						throw new IllegalArgumentException ("Invalid");
			}
			int total = 0;
			int avg = 0;
			for(int i =0; i<3; i++){
				total += marks[i];
			}
			avg = total / 3;
			System.out.println("Total: "+total);
			System.out.println("Average: "+avg);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Marks Processing completed");
		}
	}
}