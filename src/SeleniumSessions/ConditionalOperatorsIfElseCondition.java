package SeleniumSessions;

public class ConditionalOperatorsIfElseCondition {

	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		System.out.println(a>b);//false
		if(a>b) {//
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		
		if(true) {
			System.out.println("hi");
		}else {
			System.out.println("Bye");
		}
		// for string comparsion use equals or equalsignorecse
		//method 
		String s="Hello";
		String s1="h ello";
		if(s.equalsIgnoreCase(s1)) {
		System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		int total=100;
		int fee=100;// =assignment
		if(total==fee) {// ==comparsion operator
			System.out.println("total is fee");
		}else {
			System.out.println("total is not fee");
		}
		
		if(total==100) {
			System.out.println("this is correct");
		}
		if(12.22==12) {
			System.out.println("it is possible");
		}
		
		//conditional operators
		//> < >= <= == !=
		
		int c=200;
		int d=2000;
		if(c>=d) {
			System.out.println("pass");
		}
		int balance =101;
		if(balance !=100) {
			System.out.println("blnce is not correct");
		}
		
		int marks=101;
		if(marks>=90) 
		{
			if(marks<=100) 
			{
			System.out.println("pass");
		}else
		{
			System.out.println("wrong marks");
		}
			}
			else {
			System.out.println("fail");
		
		}
	
		//WAP to find out the highest number when 3 different 
		// numbers are given
		int a1=900;
		int b1=200;
		int c1=4000;
		if(a1>b1 && a1>c1) {// && operator , short circuit
			// true && true -> true
			//|| 
			System.out.println("a1 is the highest");
			
		}else if(b1>c1){
			System.out.println("b1 is greatest");
	}else {
		System.out.println("c1 is greatest");
	}
		// WAP to check the browser value and launch the respective
		//browser
		
		String browser="chrome";
		//1. if
		if(browser.equals("chrome")) {
			System.out.println("launch chrome browser using if");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		}
		if(browser.equals("ie")) {
			System.out.println("launch ie browser");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari browser");
		}
		else {
			System.out.println("please pass the correct browser");
		}
		
//		//2. if else-if
//			if(browser.equals("chrome")) {
//				System.out.println("launch chrome browser");
//			}
//			else if(browser.equals("firefox")) {
//				System.out.println("launch firefox browser");
//			}
//			else if(browser.equals("ie")) {
//				System.out.println("launch ie browser");
//			}
//			else if(browser.equals("safari")) {
//				System.out.println("launch safari browser");
//			}else {
//				System.out.println("please provide right browser");
//			}
			
		//3. switch --> switch+cntrl+space
//			switch (browser) {
//			case "chrome":
//				System.out.println("Launching chrome browser using switch");
//				break;
//			case "firefox":
//				System.out.println("Launching firefox browser using switch");
//				break;
//			case "ie":
//				System.out.println("Launching ie browser using switch");
//				break;
//			case "safari":
//				System.out.println("Launching safari browser using switch");
//				break;
//			default:
//				System.out.println("please provide the correct browser");
//				break;
//			}
	}
}

