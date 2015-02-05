
public class Car {
	private String make;
	private String model;
	private String colour;
	private String year;
	
	public Car(String make, String model, String colour, String year) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;
		show();
	}
	
	public void show() {
		System.out.println("My car's description:");
		System.out.println("---------------------");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("Year: " + year);
	}
	
	public void drive() {
		System.out.println("The Car is Driving.");
	}

}
