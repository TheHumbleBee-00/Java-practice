class TicketCounter{
	int availableSeats;
	
	TicketCounter(int availableSeats){
		this.availableSeats = availableSeats;
	}
	
	synchronized void bookTicket(int seats){
		System.out.println(Thread.currentThread().getName()+"wants"+ seats+"seats");
		if(availableSeats >= seats){
			availableSeats = availableSeats - seats;
			System.out.println("Booking successful");
			System.out.println("Remaining seats: "+availableSeats);
		}
		else
			System.out.println("Not enough seats");
		System.out.println();
	}
}
class Passenger extends Thread{
	TicketCounter counter;
	int seats;
	
	Passenger (TicketCounter counter, int seats, String name){
		this.counter = counter;
		this.seats = seats;
		setName(name);
	}
	public void run(){
		counter.bookTicket(seats);
	}
}
public class Main8{
	public static void main (String args[]){
		TicketCounter counter = new TicketCounter(5);
		 Passenger p1 = new Passenger (counter , 3, "Passenger1");
		 Passenger p2 = new Passenger (counter , 3, "Passenger2");
		 
		 p1.start();
		 p2.start();
	}
}
		 