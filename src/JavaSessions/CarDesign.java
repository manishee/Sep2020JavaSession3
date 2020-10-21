package SeleniumSessions;

public class CarDesign {
	//class variables
	String name;
	int price;
	String model;
	static int wheels=4;	
		//whenever you have a common property value
	public void start() {
		System.out.println("car start");
	}
	
	public void stop() {
		System.out.println("car stop");
	}
	
	public static void run() {
		System.out.println("car run");
	}
	
	public static void main(String[] args) {
		//how to call static members(variables and methods)
		
		//1. call static members directly
		//wheels=4;
		System.out.println(wheels);
				
		//2. call static members using class name
		//CarDesign.wheels=5;
		System.out.println(wheels);
		
		CarDesign.run();
		
		CarDesign c1=new CarDesign();
		c1.name="BMW";
		c1.model="72d0";
		c1.price=80;
		
		System.out.println(c1.name + " " + c1.price + " " +c1.model + " "+CarDesign.wheels);
		
		///c1.wheels=5;
		//c1.run();
		
	}
}


