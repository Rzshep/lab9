
public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar () {// this is needed // no return types in constructors // you know this is a constructor based on the fact that its name is the same as the name of the class
		
	}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super (make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: $%-10s (Used)	Mileage: %-10s", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), mileage);
	}
}
