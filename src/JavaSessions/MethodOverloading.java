//********************** Oct 19 *********************

package JavaSessions;

public class MethodOverloading {
	// we can't have duplicate methods in java
	//What is method overloading?
	// Within same class, when you have different methods with:
	//1. same name
	//2. having different parameters
	//3. sequence of the parameters is also different
	// test() method is called overloaded method
	//In java, method overloading is a concept of compile time polymorphism
	//At the compile time, the compiler will decide which method to call on the
	//basis of parameters
	
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test(10, 45);
		obj.test(58);
		
	}
	public void test() {
		System.out.println("test method");
	}
	
	public void test(int i) {
		System.out.println(i);
	}
	
	public void test(int k, int p) {
		System.out.println(k + " " + p);
	}
	// Here, some people get confused..refer to the below 2 methods
	public void test(int k, String p) {
		System.out.println(k+p);
	}
	
	public void test(String p, int k) {
		System.out.println(p+k);
	}
}
