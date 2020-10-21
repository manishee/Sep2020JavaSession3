//******************* Oct 19 **************
package JavaSessions;

public class MainMethodOverloading {
	//main method can be overloaded
	//main method doesnt not return anything
	
	public static void main(int i) {
		System.out.println(i);
	}
	
	public static void main(int i,int k) {
		System.out.println(i+k);
	}
	
	public static void main(int j, String p) {
		System.out.println(j+p);
	}
	public static void main(String[] x) {
		System.out.println("Hello Selenium");
		main(10);
	}

}


