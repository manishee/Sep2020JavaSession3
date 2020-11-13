
//*************** 05 October 2020 *********************

package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		// Limitations of Array
		//1. Size is fixed or static --> will be overcome by ArrayList
		//2. Stores only similar type of data --> will be overcome by ArrayList or Object Array
		
		// -> Array is a collection of multiple values
		//similar kind of values
		//int i=10;
		//int i=20;
		//int i=30;
		//System.out.println(i);
		
		//Array
		int i[]=new int[4];
		//i[-1]=5;java.lang.ArrayIndexOutOfBoundsException:
		i[0]=10;//indexing starts with 0 or lowest index li=0
		i[1]=20;
		//System.out.println(i[2]);//0
		i[2]=30;
		i[3]=40;//highest index = 3 size-1
		// to calculate the size we use length method
		//i[4]=50;java.lang.ArrayIndexOutOfBoundsException: 
		System.out.println(i.length);
		System.out.println("li is " +0);
		System.out.println("hi is " + (i.length-1));
		
		// to print the data in an array we use for loop
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("-----------");
		// for each loop
		for(Integer ele : i) {
			System.out.println(ele);
		}
		
		char ch[]=new char[3];
		ch[0]='m';
		ch[1]='f';
		
		String std[]=new String[4];
		//String[] std=new String[4];
		std[0]="Uttam";
		std[1]="Kranthi";
		std[2]="Tarun";
		std[3]="Manish";
		System.out.println("---------");
		//for each loop
		for(String data : std) {
			System.out.println(data);
		}
		// empName, empAge, empGender, empHeight, Ispermanent
		
		//Object is super class of all classes in java
		Object obj[]=new Object[5];
		obj[0]="Tom";
		obj[1]=25;
		obj[2]='m';
		obj[3]=5.6;
		obj[4]=true;
		System.out.println("------");
		// for each loop
		for(Object elements : obj) {
			System.out.println(elements);
		}
		//declare and initialize arrays
		int k[]=new int[3];
		//int[] k=new int[3];
		//int k[]=new int[] {10,20,30};
		//int k[]= {10,20,30};
		
		
		
	}

}
