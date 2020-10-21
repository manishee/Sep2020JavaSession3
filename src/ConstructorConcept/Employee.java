//****************** Oct 20 ***************
package ConstructorConcept;

public class Employee {
	//class variables
	String name;
	int age;
	int empId;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor of a class
	//looks like a function.but it is not a function
	//constructor name will be same as class name
	//a function may or may not return a value, but a cont
	//will never returns a value
	//no return and void keywords in constructors
	//constructors can be overloaded
	//constructors are called when we create the object of a class
	
	public Employee() {// default constructor or 0 parameter cons.
		System.out.println("Default emp const..");
		System.out.println("Hello Employee");
	}
	
	public Employee(int i) {
		System.out.println("one parameter const....");
	}
	
	public Employee(int i, String p) {
		System.out.println("2 parameter const..." +i +" " +p);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(20, "testing");
	}

}
// Why Constructors --> To initialize the class variables