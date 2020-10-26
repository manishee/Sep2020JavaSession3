//************** Oct 23- P1*************
package ConstructorConcept;

public class Employee {

	public static void main(String[] args) {
		System.out.println("hello");
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(10, "Selenium");
	}
	//Constructor of a class
	//constructor name is same as class name
	//Looks like a function, but it is not a function
	//a function may or may not return a value but a constructor will never return a value
	//no void or return keyword
	//constructors can be overloaded.. duplicate constructors are not allowed
	//Constructors are called when an object is created...
	
	public Employee() {// default or 0 parameter const...
		System.out.println("default emp cons..");
		System.out.println("Hello Emp");
	}
	
	public Employee(int i) {
		System.out.println("one parameter constructor");
	}
	
	public Employee(int i, String p) {
		System.out.println("2 parameter constructor");
	}
}
