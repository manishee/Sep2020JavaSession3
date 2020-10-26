// **************** Oct -P2 **************
package ConstructorConcept;

public class Person {
	//class or global variables
	String name;//null
	int age;
	double salary;
	boolean isPermanent;
	char gender;//blank
	// Constructors are used to initialize the class variables
	
	public Person() {
		System.out.println("Hello Person");
	}
	
	
	public Person(String name) {
		
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Person(String name, int age, double salary, boolean isPermanent) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}

	public Person(String name, int age, double salary, boolean isPermanent, char gender) {
	
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}


	public static void main(String args[]) {
		Person p1=new Person();
		System.out.println(p1.name);
		System.out.println(p1.gender);
		
		Person p2=new Person("Tarun");
		Person p3=new Person("Nikita", 25);
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		Person p4=new Person("Rahul", 18, 20.00, true, 'm');
		System.out.println(p4.name + " " + p4.age + " " + p4.salary +  " " + p4.isPermanent + " " +p4.gender);
		
		Person p5=new Person("Rohita", 28, 30.00, false, 'f');
		System.out.println(p5.name + " " + p5.age + " " + p5.salary +  " " + p5.isPermanent + " " +p5.gender);
		
		
	}
	
	
	
}
