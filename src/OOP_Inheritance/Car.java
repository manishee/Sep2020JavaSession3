//******************** Oct 29 - P1 **************
package OOP_Inheritance;

public class Car extends Vehicle {

	public String price() {
		System.out.println("car - price");
		return "Car price is 10L";
	}
	
	public void start() {
		System.out.println("car - start");
	}
	
	public void stop() {
		System.out.println("car - stop");
	}
	
	public void refuel() {
		System.out.println("car - refuel");
	}
	
	public static void wheels() {
		System.out.println("Car -- wheels");
	}
}

//Notes what is final keyword and where it is used?
// final variable value can't be modified
// a method declared as final can't be overridden
// a class declared as final can't be inherited/extended
