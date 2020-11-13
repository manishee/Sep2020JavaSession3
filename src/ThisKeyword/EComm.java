//**** Nov 12-P1****
package ThisKeyword;
// Builder Pattern using this keyword
public class EComm {

	//returning the object of a particular class using this keyword
	//Each and every method of this class can return the object of the class
	//this is called Builder Pattern
	
	public EComm login(String un, String pwd) {
		System.out.println("login with : " +un +" and " + pwd);
		return this;
	} 
	
	public EComm search(String productName) {
		System.out.println("search with : " + productName);
		return this;
	}
	
	public EComm search(String productName, int price) {
		System.out.println("search with : " + productName + " " + price);
		return this;
	}
	
	public EComm checkOut(String productName) {
		System.out.println("check out with :" + productName);
		return this;
	}
	public EComm doPayment(String CC, String pwd) {
		System.out.println("payment is done using : " + CC + " " + pwd);
		return this;
	}
	
	public EComm generateOrder(String productName) {
		System.out.println("your order id is: " + 12345 + "for this product " + " " + productName);
		return this;
	}
	
}
