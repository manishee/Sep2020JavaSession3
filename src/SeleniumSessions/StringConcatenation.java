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
	
	}

}
