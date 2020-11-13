//**Nov 12-P7***

package AccessM2;
//if you have to use a file from another package, you have to import it
import AccessM1.Emp;
//the import statement has to be second statement in the program
public class HR extends Emp{

	public static void main(String[] args) {
		
		HR hr = new HR();
		System.out.println(hr.name);
		//System.out.println(hr.age);
		System.out.println(hr.salary);
		//System.out.println(hr.c);
	}

}
