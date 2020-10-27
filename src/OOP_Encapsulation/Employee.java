//**************** Oct 26- P1****************
package OOP_Encapsulation;

public class Employee {
	
	//class variables
	// hiding the private data members of class
	//deliberately private 
	//secure my data members
	//data members - (non static)class variables + class methods
	//Encapsulation- hiding data members and providing a public layer to
	//the outside world to access those members
	//data hiding is a part of encapsulation
	//we can achieve data hiding through encapsulation
	//setter will always use this keyword
	//getter will always return
	private String name;
	private int id;
	private int age;
	private double salary;
	
	//getter and setter methods: (public methods)
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="Tom";
		System.out.println(e1.name);
		
		
	}

}
