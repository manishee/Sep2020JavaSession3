//**** Nov 12-P2*****
package ThisKeyword;

public class Shopping {

	public static void main(String[] args) {

		EComm e1=new EComm();
		
		e1
		.login("ram@gmail.com","admin@123")
		.search("Macbook", 2000)
		.checkOut("Macbook")
		.doPayment("1233 2323 2223 1231", "wd1213")
		.generateOrder("Macbook");
	
		System.out.println("----------------");
		
		e1
		.search("Logitech mouse")
		.doPayment("1233 2323 2223 1231", "wd1213")
		.generateOrder("Logitech mouse");
		
	}
	
	//Advantage - you can create a number of scenarios

}
