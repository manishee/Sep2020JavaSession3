package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//default class in java
		
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		//ar.add method
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());
		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		System.out.println(ar.size());
		ar.add(800);//7
		ar.add(900);//8
		ar.add(1000);//9
		System.out.println(ar.size());
		ar.add(1100);//10
		//get method to print the elements of an ArrayList
		System.out.println(ar.get(1));
		System.out.println(ar.get(8));
		System.out.println("li is " + 0);
		System.out.println("hi is + " + (ar.size()-1));
		
		ArrayList arr=new ArrayList();//dynamic
		arr.add("Uttam");
		arr.add('M');
		arr.add(38);
		
		for(int i=0;i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("------ **** -------");
		
		//generics
		ArrayList<Integer> marksList =new ArrayList<Integer>();
		marksList.add(20);
		marksList.add(30);
		marksList.add(40);
		marksList.add(50);
		//marksList.add("tom");
		// for each
		for(Integer ele : marksList) {
			System.out.println(ele);
		}
		System.out.println("------ **** -------");
		ArrayList<String> countryList =new ArrayList<String>();
		countryList.add("USA");
		countryList.add("India");
		//for each loop
		for(String data : countryList) {
			System.out.println(data);
		}
		
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add('m');
		empData.add(true);
		empData.add(34.55);
		System.out.println("------------");
		for(int j=0; j<empData.size(); j++) {
			System.out.println(empData.get(j));
		}
		
		//for each
		//syso+cnt+space
		for(Object elements : empData) {
			System.out.println(elements);
		}
	}

}
