package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		
		//1 . while loop
		int i=1;// initialization 
		while(i<=10) {//conditional 
			System.out.println(i);
			i++;// incremental or decremental part
			//Limitation of while loop -> if you miss incremental part
			//the loop will run infinitely
		}
		
		//2. For loop
		System.out.println("-------");
		for(int k=1; k<=10;k++) {
			System.out.println(k);	
		}
		System.out.println("----------");
//		for(; ;) {
//			System.out.println("hi");
//		}
		System.out.println("--------");
		
		//WAP using for loop to print the even numbers between 0 and 10
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		//WAP to print character a-z using for loop
		System.out.println("---------");
		for(char c='a'; c<='z'; c++) {
			System.out.print(c);
		}
		System.out.println("--------");
		//WAP to print string using for loop -- wont work with for loop
//		for (String str="Welcome to Hotel Taj"; str.equals("Welcome to Hotel Taj");) {
//			System.out.println(str);
//		}
		
		System.out.println("-------");
		for(byte b=1; b<=5; b++) {
			System.out.println("byte" +b);
		}
		System.out.println("--------");
		for(double d=1.1; d<=10;d++) {
			System.out.println(d);
		}
		System.out.println("--------");
		//WAP to find out the multiples of 5 under 100
		for (int h=1; h<=100; h++) {
			//System.out.println(h);
			if(h%5==0)
			System.out.println("yes it a multiple " +h);
		}
		
		System.out.println("--------");
		
		//WAP using for loop to print the odd numbers from 0 to 10
		for(int odd=1; odd<10; odd=odd+2) {
			System.out.println(odd);
		}
		System.out.println("-----");
		
		//3. Do while --> It will execute once even if the condition is not met
		int n=1;
		do{
			System.out.println(n);
			n++;
		}
		while(n<=0);
	}

}
