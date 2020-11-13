//*** Nov 12-P6****
package AccessM1;
//same package non sub class
public class Contractor {

	public static void main(String[] args) {
		//there is no relationship between Emp and Contractor class
//		Contractor c=new Contractor();
//		System.out.println(c.name);
//		System.out.println(c.age);
//		System.out.println(c.salary);
//		System.out.println(c.c);
		
		//If we want to access anything from Emp class
		//we have to make an object reference of Emp class
		
		Emp e=new Emp();
		System.out.println(e.name);
		//System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.c);
		
		
		
		
	}

}
