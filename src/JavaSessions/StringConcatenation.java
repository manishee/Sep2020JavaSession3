package SeleniumSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		double d=12.33;
		double d1=23.33;
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Testing";
		
		System.out.println(d+d1);
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+d+d1+a+b);
		System.out.println(x+y+(d+d1)+a+b);
		System.out.println(x+y+" "+(d+d1)+(a+b));
		
		System.out.println("the value of a is" + " " + a);
		System.out.println("the sum of a and b is " +(a+b));
		
		int i=4/2; // 4 divided by 2
		System.out.println(i);
		System.out.println(4/2); // printing directly
		System.out.println(5/2);// it will print =2
		//.5 depends on 5 and 2. they are both integers , output will be 
		// an integer
		System.out.println(5.0/2);//2.5 ..either of 5.0 or 2 is a float
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		
		//int k=9/2.0;
		//System.out.println(k);
		float k1=9/2.0f;
		float k2=(float)(9/2.0);
		double d3=9/2.0;
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(d3);
		
		//int p=9/0;// anything divided by zero will throw an exception
		//java.lang.ArithmeticException: / by zero
		
		int m=0/9;
		System.out.println(m);//0
		
		int n=0/0;
		System.out.println(n);//anything divided by zero will throw an exception
		//java.lang.ArithmeticException: / by zero
	}

}
