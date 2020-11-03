//****************** Oct 29 - P2 ***************
package OOP_Inheritance;

public class BMW extends Car{
	//Method Overriding:
	//is a polymorphism ==> Runtime polymorphism
	//when you have a method in parent class with the same name
	//and same number of parameters also available in child class
	//..then it is Method Overriding
	//static methods can be overloaded but cant be overridden
	@Override
	public void start() {
		System.out.println("BMW-start");
	}
	
	@Override
	public String price() {
		System.out.println("BMW--price");
		return "BMW price return";
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	//stop
	//refuel
	
	public static void wheels() {
		System.out.println("BMW -- wheels");
	}
}
