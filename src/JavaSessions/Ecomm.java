//************************ Oct 19 ******************
package JavaSessions;

public class Ecomm {

	public static void main(String[] args) {
		Ecomm e1=new Ecomm();
		e1.search("samsung");
		e1.search("Honda", "Blue");
		e1.login(9472937, "abc@g.com", "lhflhaj", "erw65");

	}
		
	public void search() {
		
	}
	
	public void search(String name) {
		System.out.println("Displaying samsung tv");
		
	}
	
	public void search(String name, int price) {
		
	}
	
	public void search(String name, String color) {
		System.out.println("Displaying honda cars");
		
	}
	
	public void search(String name, int price, String color, String seller) {
		
	}
	
	
	//payment
	public void payment()
	{
		
	}
	//UPI _ unified payment interface ..works on Mobile devices
	public void payment(String UPI)
	{
		
	}
	public void payment(long cc, int cvv)
	{
		
	}
	public void payment(String UPI,int otp)
	{
		
	}
	
	//Login
	
	public void login() {
		
	}
	
	public void login(String email, String password) {
		
	}
	
	public void login(long number, String password) {
		
	}
	
	public void login(String email, String password, String captcha) {
		
	}
	
	public void login(long number,String email, String password, String captcha) {
		System.out.println("Hello Tarun..you are logged in to FB");
	}
}
