//***************** Nov 2-p1*******************
package OOP_Interface;

public interface USMedical extends WHO{
	
	int admission_fee=50;
	//Interface - No method body
	//Only method declaration -- method prototype
	//Can't create object of an interface
	//Interface variables are always static and final
	
	public void orthoServices(); //abstract method
	public void physioServices();
	public void emergencyServices();
	public void audiologyServices();
	
	// We can have static methods with the method body
	public static void minFee(){
		System.out.println("USMedical - Min fee is 10$");
}

}
