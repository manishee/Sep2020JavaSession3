package SeleniumSessions;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		String assets_Manish[]=e1.getEmployeeAssets("Manish");
		System.out.println("total assets " + assets_Manish.length);
			
			//for each loop
		for(String data : assets_Manish) {
			System.out.println(data);
		}
//		String assets_Tarun[]=e1.getEmployeeAssets("Tarun");
//		System.out.println("total assets " + assets_Tarun.length);
		
		ArrayList<String> orderList_Steve=e1.getEmpOrders("Steve");
		System.out.println("total orders " + orderList_Steve.size());
		//for each
		for(String data : orderList_Steve) {
			System.out.println(data);
		}
		
		ArrayList<String> orderList_Tom=e1.getEmpOrders("Tom");
		System.out.println("total orders " + orderList_Tom.size());
		//for each
		for(String data : orderList_Tom) {
			System.out.println(data);
		}		
		
	}
	//WAM where we have to pass the employee name and return the employee assets
	
	public String[] getEmployeeAssets(String empName) {
		System.out.println("Getting info for : " +empName);
		
		String []asset=new String[4];
		
		if(empName.equals("Manish")) {
			asset[0]="Macbook Pro";
			asset[1]="Keyboard";
			asset[2]="Mouse";
			asset[3]="Iphone X";
		}
		
		else if(empName.equals("Tarun")) {
			 
			asset[0]="Windows Laptop";
			asset[1]="Keyboard";
			asset[2]="Mouse";
			asset[3]="Headphone";
			}
		else {
			System.out.println("This employee " + empName + " is not found" );
			return null;
		}
		return asset;
	}
	//WAM where the order list is returned based on the name of the employee..
	// Array List
	
	public ArrayList<String> getEmpOrders(String empName) {
		System.out.println("get emp orders for " +empName);
		//Generics
		ArrayList<String> orderList=new ArrayList<String>();
		
		if(empName.equals("Tom")) {
			orderList.add("Iphone");
			orderList.add("Laptop");
			orderList.add("Tshirt");
			orderList.add("Shoes");
		}
		else if(empName.equals("Steve")) {
			orderList.add("Iphone");
			orderList.add("Laptop");
		}
		else {
			System.out.println("this emp " + empName + " is not found, please check");
		}
		
		return orderList;
	}
	
	
}
