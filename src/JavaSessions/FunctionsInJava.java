//****************** October 13 *****************

package SeleniumSessions;

public class FunctionsInJava {

	public static void main(String[] args) {
		// Functions and methods are synonyms
		// Functions will reduce code
		//We can achieve reuseability using functions
		//Functions are independent of each other
		//Functions are parallel to each other
		//We can't create a function inside a function
		//main()method is also a function
		//Functions are created inside the class
		//we can call a function from another function
		//a function can or cant return anything
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		
		//FunctionsInJava obj1=new FunctionsInJava();
		//obj1.test();
		
		obj.printName();
		obj.total();
		int sum=obj.add();
		System.out.println(sum+5-10);
		System.out.println(obj.add());
		String city=obj.printCityName();
		System.out.println(city);
		
		int s1=obj.getSum(90, 20);
		System.out.println(s1);
		
		int s2=obj.getSum(900, 20);
		System.out.println(s2);
		
		String cityName=obj.getCapitalName("UA");
		System.out.println(cityName);
		
		String cityName2=obj.getCapitalName("USA");
		System.out.println(cityName2);
	}
	//public -> publicly accessible
	//void -> doesnt return anything
	
	//Functions - 3 types
	
	//1. no input and no return
	public void test() {
		System.out.println("Inside test method");
	}
	//naming convention -camel case : lowerUpper
	public void printName() {
		System.out.println("Java and Selenium");
	}
	
	public void total() {
		System.out.println("Inside total method");
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	
	//2. no input and some return
	public int add() {
		System.out.println("Inside add method");
		int a=100;
		int b=200;
		int c=a+b;
		
		return c;//c=300
	}
	//a method can return only one value at a time.
	public String printCityName() {
		System.out.println("Print city name");
		String cityName="Montreal";
		int t=100;
		return cityName;
		//return t;
	}
	//3. some input and some return
	public int getSum(int a, int b) {
		System.out.println("inside getSum method");
		int sum=a+b;
		return sum;
		
	}
	
	//WAP to get the capital name of a country
	public String getCapitalName(String countryName) {
		System.out.println("Getting capital name for " + countryName );
		if(countryName.equals("India")){
			return "New Delhi";
		}else if(countryName.equals("USA")) {
			return "Washington DC";
		}else if(countryName.equals("UK")) {
			return "London";
		}else {
			System.out.println("Country name not listed");
			return null;
		}
		
	}
	

}
