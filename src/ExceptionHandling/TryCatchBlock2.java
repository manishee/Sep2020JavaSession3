//***************** Nov 6_p2 ****************
package ExceptionHandling;

public class TryCatchBlock2 {

	String name= "Tom";
	public static void main(String[] args) {

		System.out.println("hello testing");
		
		TryCatchBlock2 obj=new TryCatchBlock2();

		System.out.println(obj.name);
		
		//obj=null;
		try {
		int i=9/0;	
		System.out.println(obj.name);
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("AME is coming");
			e.printStackTrace();
		}
		
//		try 
//		{
//		int i=9/0;
//		}catch(ArithmeticException e){
//			System.out.println("some exception is coming..");
//			System.out.println(e.getMessage());
//		}
		System.out.println("hello testing");
		System.out.println("hello testing");
		System.out.println("hello testing");
	}

}
