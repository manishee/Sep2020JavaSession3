//******************** Oct 20 **********************
package JavaSessions;

public class Login {

	public static void main(String[] args) {
		Login l=new Login();
		l.login();
		l.search();
		
	}
	// All non static methods can call each other without creating the 
	//object..because they are part of the object.
	public void login() {
		profile();
		test(); // objects will hold the same property and its 
		//available in the same class
	}
	
	public void profile() {
		search();
		addToCart();
		payment();
	}
	
	public void search() {
		
	}
	
	public void addToCart() {
		
	}

	public void payment() {
		
	}
	
	public void getOrder() {
		
	}
	
	public static void test() {
		price();
	}
	public static void price() {
		//search(); --> not allowed
	}
}
