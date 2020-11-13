//** Nov 12-P3 *****
package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to integer conversion
		
		//Integer and Double are wrapper class
		//String is not a wrapper class
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y="34.55";
		System.out.println(y+20);
		
		double d=Double.parseDouble(y);
		System.out.println(d+20);
		
//		String h="100A";
//		int p=Integer.parseInt(h);
//		System.out.println(p+20);
		
		//int to String
		int k=100;
		System.out.println(k+20);
		
		String k1=String.valueOf(k);
		System.out.println(k1+20);
		
	}

}
