package SeleniumSessions;

public class DataTypes {

	public static void main(String[] args) {
		//syso+cntrl+space
		
		// comments entered by Manish
		/*
		 * Multiline comments 
		 * Sep 22, 2020 
		 * Data Types
		 * 
		 */
		//Data types
		//Integer family - byte, short, int, long
		//Floating family - float, double
		//Character - char
		//boolean - true, false
		//String
		
		//1. byte
		//range: -128 to 127
		//size: 1 byte = 8 bits 
		byte b=100;
		System.out.println(b);
		byte b1=20;
		byte b2=0;
		byte b3=-90;
		byte b4=20;
		System.out.println(b1);
		System.out.println(b3+b4);
		System.out.println(b1+b2);
		
		
		//2. short
		//range: -32768 to 32767
		//size: 2 bytes= 16 bits
		short s1=10;
		short s2=-1000;
		short s3=100;
		System.out.println(s1);
		System.out.println(s2-s3);

		
		//3. int
		//range:-2147483648 to 2147483647
		//size: 4 bytes = 32 bits
				
		int i=10;
		int total=20000;
		System.out.println(i);
		System.out.println(total);
		
		//4. long
		//range:
		//size: 8 bytes = 64 bits
		long l=803808343;
		System.out.println(l);
		
		//5. float
		//range:7 digits after decimal place
		//size:4 bytes = 32 bits
		
		float f=12.33f;
		System.out.println(f);
		float f1=(float)23.44;
		System.out.println(f1);
		System.out.println(f+f1);
		float f2=100;//100.0
		System.out.println(f2);
		
		//6. double
		//range: 15 digits after decimal
		//size:8 bytes=64 bits
		double d=23.33;
		double d1=34.79734;
		System.out.println(d);
		System.out.println(d1);
		
		//7. char
		//range:2 bytes = 16 bits
		//size:character have single digit value
		char ch='a';
		char ch1='b';
		char ch2='3';
		char ch3='$';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(ch+ch1);
		//ascii values
		//a-z:97-122
		//A-Z:65-90
		//0-9:48-57
		
		//8. boolean
		//size=1 bit
		//true/false
		boolean flag=true;
		boolean test=false;
		System.out.println(flag);
		System.out.println(test);
		
		//9. String 
		// String -> a dobule quoted value in java
		// String is not a data type in java. It is a Class
		// all the classes in java starts with upper case
		
		String str="Hello World";
		System.out.println(str);
		String str1="100";// here 100 is a string not an integer
		System.out.println(str+str1);
		// multiple properties of print statement
		System.out.println(1000);
		System.out.println(str);
		System.out.println("Hello World");
		System.out.println(10+20);
		System.out.println("testing" +100);
		
		System.out.println("Hello" + "World");
		System.out.println("Hello " + "World");
		System.out.println("Hello" + " World");
		System.out.println("Hello" + " " + "World");
		
		System.out.print(80);// print and stay in the same line
		System.out.println(60);// prints and generates a new line
		System.out.println(70);
		
		System.err.println("print something in red");// print something
		// in red like in exception handling.
		
		System.out.println(4/2);
		System.out.println(5%2);//modulus operator -> divides and gives the remainder
	}

}
