import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// prompt the user for how many cars they want to enter
		//System.out.println("How many cars are you entering?: ");
		// get user input and store it
		//int numOfCars = scan.nextInt();
		
		String cont = "yes";
		
		
		while (cont.equalsIgnoreCase("yes")) {
		
		ArrayList<Car> carLot = new ArrayList<Car>();
		carLot.add(new Car("Zord", "Z-120", 2018, 44000.00));
		carLot.add(new Car("Yeep", "Angler", 2018, 42000.00));
		carLot.add(new Car("Doss", "Jersey", 2018, 24000.00));
		carLot.add(new UsedCar("Hyonda", "Prior", 2004, 5500.00, 102000.00));
		carLot.add(new UsedCar("Chewie", "Vett", 2008, 18000, 88000.00));
		carLot.add(new UsedCar("Kio", "Awesomea", 2012, 12500, 58000.00));
		
		for(Car i : carLot) {
			
				System.out.println(i);
			} 
		
		System.out.println("Which car would you like to buy? (0-5)");
		int carPick = scan.nextInt();
		
		
	
			
		System.out.println("Excellent! Our finance department will be in touch shortly.");
		carLot.remove(carPick);
			for(Car i : carLot) {
				
				System.out.println(i);
			} 
			
			System.out.println("Would you like to continue shopping?");
			cont = scan.nextLine();
		}
	}
	}	
	
			
			
//		} System.out.println("Would you like to continue car shopping?");
//		cont = scan.nextLine();
//	}
	
			
//				} 
		// create a for loop because you will know how many times it will run based on how many cars they've entered, and take input
			//you will ask for make, model, year, and price
			// use scanner to get input
		
		
//		for(int i = 0; i < numOfCars; i++) {
//			String make = Validator.getString(scan, "What is the make of the car?");
//			String model = Validator.getString(scan, "What is the model of the car?");
//			int year = Validator.getInt(scan, "What is the year of the car?: ");
//			double price = Validator.getDouble(scan, "What is the price of the car?: ");
//			System.out.println(); // sysout + control + space
			
			
//		+++++++	Car vehicle = new Car(make, model, year, price); // Car is class type // When an object is created, the first thing Java does is it calls the constructor //vehicle is an object
			
			//carLot.add(vehicle);
			
//			} +++++++++++
//		for(int i = 0; i < carLot.size(); i++) {
//			//carLot.get(i).toString();
//			System.out.println(carLot.get(i).toString());
//		}+++++++++
		
			
		
		
		
		
//	System.out.println("Goodbye!");
		

	


	



