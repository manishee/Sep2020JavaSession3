package JavaSessions;

public class FinalizeMethodConcept {

	public static void main(String[] args) {

		//Finalize is a garbage collector method
		//before gc is called... finalize method is called
		//gc destroys the objects which have no reference or null reference
		//just before doing any garbage clean up activity, this finalize method
		//will be called
		
		String s=new String("Manish");
		FinalizeMethodConcept obj=new FinalizeMethodConcept();
		//obj=null;
		s=null;
		
		System.gc();//calling the gc method
		System.out.println("done");
		
	}
	@Override
	public void finalize() {//coming from object
		System.out.println("this is my finalize method");
	}
	

}
