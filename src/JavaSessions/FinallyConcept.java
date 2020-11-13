package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) 
	{

		//Finally is associated with try catch block
		//Finally is a block - it will be executed all the time
		//doesn't matter if exception is coming or not
		 
		int p=10;
		
		try 
		{
		System.out.println("this is before exception");
		System.out.println("DB Connection-- trying to connect");
		System.out.println("DB Connection-- it is completed");
		int z=p/2;
		}
		catch(ArithmeticException e) 
		{
		System.out.println("some exception is coming");
		//e.getMessage();
		//e.printStackTrace();
		}
		finally
		{
		System.out.println("executing finally block");	
		System.out.println("flush/close the connection ..... ");
		}		
		
		int m=getMarks("Ali");
		System.out.println(m);
	}
		public static int getMarks(String name) 
		{
			
			try 
			{
			if(name.equals("Neha"))
			{
				return 100;	
			}
			else if (name.equals("Priya"))
			{
				return 90;
			}
			else if(name.equals("Ali")) 
			{
				int i=9/0;
				return 95;
			}else
			{
				return -1;
			}
			}
			catch(Exception e)
			{
				return -2;
			}
			finally
			{
				System.out.println("bye ....");
				return -3;
			}
		
	}
		}


