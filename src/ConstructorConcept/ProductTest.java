//***************** Oct 23 - P4 ***************
package ConstructorConcept;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1=new Product("Nike Shoes", 50);
		System.out.println(p1.name);
		System.out.println(p1.price);
		
		Product p2=new Product("macbook", 500, "silver");
		System.out.println(p2.name);
		System.out.println(p2.price);
		System.out.println(p2.color);
		
		ArrayList<String> windowsSellerList=new ArrayList<String>();
		windowsSellerList.add("Best Buy");
		windowsSellerList.add("Microsoft");
		windowsSellerList.add("Staples");
		
		
		Product p3=new Product("Windows", 400, "Black", windowsSellerList);
		System.out.println(p3.name + " " +p3.price + " " + p3.color + " "+p3.sellerList);
		System.out.println(p3.sellerList.get(2));
		
		//for each loop
		for(String data : p3.sellerList) {
			System.out.println(data);
		}
	}

}
