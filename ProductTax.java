import java.util.*;
interface Taxable{
	int calculateTax();
}
class Product{
	String productName;
	int price;
	void accept(String productName, int price){
		this.productName = productName;
		this.price = price;
	}
	void display(){
		System.out.println("Name: " + productName);
		System.out.println("Price: "+ price);
	}
}
class ImportedProduct extends Product implements Taxable{
	int customsRate;
	int gstRate;
	void acceptRate ( int customsRate, int gstRate){
		this.customsRate = customsRate;
		this.gstRate = gstRate;
	}
	public int calculateTax(){
		return price * (customsRate + gstRate);
	}
	int finalPrice(){
		return price + calculateTax();
	}
}
public class ProductTax{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		ImportedProduct obj = new ImportedProduct();

		System.out.println("Enter name of product: ");
		String n = sc.nextLine();
		System.out.println("Enter price: ");
		int p = sc.nextInt();
		System.out.println("Enter customs rate and gst rate: ");
		int c = sc.nextInt();
		int g = sc.nextInt();
		
		obj.accept(n,p);
		obj.acceptRate(c,g);
		
		obj.display();
		System.out.println("Total Tax: " + obj.calculateTax());
		System.out.println("Total Price: "+obj.finalPrice());
	}
}