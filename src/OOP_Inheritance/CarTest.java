//*************** Oct 29 -P3 ***************
package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.refuel();//Inherited from Car class
		b.stop();//Inherited from Car class
		
		b.start(); //overridden methods
		b.price(); // overridden methods
		b.autoParking(); // independent method of BMW
		b.engine();
		BMW.wheels();
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.wheels();
		
		//c.autoParking();
		
		//Top casting
		Car c1=new BMW();//create an object in the memory
		//the object of a child  class is referred by a parent class object
		
		c1.start();
		c1.stop();
		c1.refuel();
		c1.price();
		//c1.autoParking();//ref check is done 
		
		//Down casting
		//BMW b1=(BMW) new Car();
		
		
		
	}

}
