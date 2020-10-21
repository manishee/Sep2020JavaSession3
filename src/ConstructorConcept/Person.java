//***************** Oct 20 ******************
package ConstructorConcept;

public class Person {
	//class variables or global variables
	String name;// null
	int age; //0
	double salary; //0.0
	boolean isPermanent; //false
	char gender;// blank
		
	public Person() {
		System.out.println("Hello");
	}
		public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
		
		
	public static void main(String[] args) {
		Person p1=new Person("Nikita", 25);
	
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		
	}

}
