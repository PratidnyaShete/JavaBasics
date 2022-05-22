package Session_9;

public class Car {
	
	String name;
	int price;
	String colour;
	
	static int wheels = 4;
	
	public static void main(String[] args) {
		Car sportsCar = new Car();
		sportsCar.name = "BMW";
		sportsCar.price = 50000;
		sportsCar.colour = "Sterling Black";
		System.out.println("------------------");
		System.out.println(sportsCar.name);
		System.out.println(sportsCar.price);
		System.out.println(sportsCar.colour);
		System.out.println(wheels);
		System.out.println("------------------");
		
		Car passengerCar = new Car();
		passengerCar.name = "Traveller";
		passengerCar.price = 300000;
		passengerCar.colour = "Brown";
		
		System.out.println(passengerCar.name);
		System.out.println(passengerCar.price);
		System.out.println(passengerCar.colour);
		System.out.println(wheels);
		System.out.println("------------------");
		
		
	}
	
	
	
	

}
