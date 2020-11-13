//********** Nov 9 - P1*****************
package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		//Throw Keyword --> It is used to generate our own exception
		//we will use this in our framework
		//Advantages - 
		//1. proper error messaging
		//2 . deliberately throw your own exception
		
		System.out.println("Hello Testing");
//		try 
//		{
//		throw new Exception("Some exception is coming ....");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());	
//			e.printStackTrace();
//		}
		
		//String s="Naveen";//this data is coming from excel sheet
		String s="Naveen";
		//if(s.equals(null))
		
		//s.equals(null)
		System.out.println(s.equals(null));
		//if(s.equals(null)) {//the moment s==null, i want to throw my own exception
		
			System.out.println("bye");//will it print bye ..no ..y coz s is not equl to null		
//			try
//			{
//			throw new Exception("Excel value Exception - value is null");	
//			}
//			catch(Exception e) {
//			e.printStackTrace();
//			}
		}
		
	}


