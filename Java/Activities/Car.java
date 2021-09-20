package Test;

public class Car {

	//ring Color;
	//ring transmission;
	//t make;
	int tyres;
	int doors;
	 
 String Color;
	 String transmission;
	 
	 int make;
	
//Constructor
Car()
{
	tyres=4;
	doors=4;
}
public void displayCharactersitics()
{
	System.out.println("Color of the car: " + Color);
	System.out.println("Transmission of the car: " + transmission);
	System.out.println("make of the car:" + make);
	System.out.println("Number of the doors on the car:" + doors);
	System.out.println("Number of the tyres on the car:" + tyres);
}

public void accelerate()
{
	System.out.println("Car is moving forward.");
}

public void brake()
{
	System.out.println("Car has stopped.");
}

	
}
			
	
			



