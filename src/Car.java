/**
 * 
 */

/**
 * 
 *
 */
public class Car {
	
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car () {// this is needed // no return types in constructors // you know this is a constructor based on the fact that its name is the same as the name of the class
		make = "default";
		model = "default";
		year = 0;
		price = 0.0;
	}
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//public Car(String make, String model, int year, double price) { // this part is optional
		
	//}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: $%-10s", make, model, year, price);
	}
	


}
