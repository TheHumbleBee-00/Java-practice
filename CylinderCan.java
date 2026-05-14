public class CylinderCan{
	int radius;
	int height;
	
	CylinderCan() {
		redius = 1;
		height = 1;
	}
	CylinderCan(int radius, int height){
		this.radius = radius;
		this.height = height;
	}
	double CSA(){
		return 2*radius*height*3.14;
	}
	double vol(){
		return 3.14 * radius * radius * height;
	}
	void display(){
		System.out.println("Curved Surface Area: " + CSA());
		System.out.println("Volume: "+vol());
	}
	public static void main(String args[]){
		CylinderCan obj = new CylinderCan ();
		CylinderCan obj1 = new CylinderCan(3,5);
		obj.display();
		System.out.println("");
		obj1.display();
	}
}