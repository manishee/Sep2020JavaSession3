//***************** October 16 **********************
package SeleniumSessions;

public class EmpTest {
	String name;
	int age;
	boolean status;
	double salary;
	//static can be used only with class variables
	static String lastName; 
	
	// default values of different data types
	public static void main(String[] args) {
		final int total=10;// Local variables should be initialized
		// static cant be used with local variables.
		//final --> cant change the value of that variable
		System.out.println(total);
		
		EmpTest e1=new EmpTest();
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		System.out.println(e1.status);//false
		System.out.println(e1.salary);//0.0
		System.out.println(EmpTest.lastName);//null
		
		final int days=7;
		System.out.println(100*days*200);
	}

}
