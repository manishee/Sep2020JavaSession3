//**************** Oct 8*****************
package JavaSessions;

public class Car {// Car is a template
	//class variables or global variables
	
	String name;
	String model;
	int price;
	String color;
	public static void main(String[] args) {
		
		Car c1=new Car();
		//c1 is the name/reference of the object
		//new Car() is the object
		
		c1.color="Blue";
		c1.name="BMW";
		c1.price=40000;
		c1.model="520d";
		
		Car c2=new Car();
		c2.color="White";
		c2.name="Audi";
		c2.price=48000;
		c2.model="Q7";
		
		System.out.println(c1.name+ " "+ c1.color+ " "+ c1.price+ " "+c1.model);
		System.out.println(c2.name+ " "+ c2.color+ " "+ c2.price+ " "+c2.model);
		
		// no reference objects
		new Car().color="Black";
		new Car().model="Honda";
		//null reference object
		Car c3=new Car();
		c3=null;
		
		System.gc();
	}

}
