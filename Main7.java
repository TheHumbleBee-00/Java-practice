class TablePrinter implements Runnable {
	int number;
	int start;
	int end;
	
	TablePrinter (int number, int start, int end){
		this.number = number;
		this.start = start;
		this.end = end;
	}
	public void run(){
		try{
			for(int i = start; i<=end; i++){
				System.out.println(Thread.currentThread().getName() + ": " + number+ " X "+i+ " = "+(number*i));
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread interrupted");
		}
	}
}
public class Main7{
	public static void main(String args[]){
		TablePrinter t1 = new TablePrinter(5,1,10);
		TablePrinter t2 = new TablePrinter(7,1,10);
		
		Thread T1 = new Thread (t1, "Thread 1");
		Thread T2 = new Thread (t2, "Thread 2");
		
		T1.start();
		T2.start();
	}
}		