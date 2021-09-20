package Test;

public class Activity1 extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car BMW= new Car();
		BMW.make = 2014;
		BMW.Color ="white";
		BMW.transmission = "Manual";
		
		//Call method
		BMW.displayCharactersitics();
		BMW.accelerate();
		BMW.brake();
		
		
	}

}
