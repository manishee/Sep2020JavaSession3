package OOP_Abstract;

public abstract class Page {
	
	//we can create a constructor of an abstract class
	public Page() {
		System.out.println("Page Constructor");
	}
	
	//Can't create the object of an abstract class
	//may have some abstract methods
	//may have non abstract methods also
	
	public abstract void title();//abstract method
	public abstract void url();
	
	//non abstract method
	public void timeOut() {//non abstract method
		System.out.println("Page --time out");
	}
	//static method
	public static void logo() {
		System.out.println("Page -- logo");
	}

}
