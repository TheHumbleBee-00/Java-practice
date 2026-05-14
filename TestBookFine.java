import java.util.*;
import libraryinfo.BookFine;

public class TestBookFine{
	public static void main (String args []){
		Scanner sc = new Scanner (System.in);
		BookFine obj = new BookFine();
		
		System.out.println("Enter rollno: ");
		int r = sc.nextInt();
		System.out.println("Days late and the fine per day: ");
		int d = sc.nextInt();
		int f = sc.nextInt();
		
		obj.accept(r,d,f);
		obj.display();
	}
}