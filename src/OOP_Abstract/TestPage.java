package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.title();
		lp.url();
		lp.timeOut();
		Page.logo();
		
		//Page p1=new Page(); --> can't create the object of abstract class
		//top casting
		Page p=new LoginPage();
		p.title();
		p.url();
		p.timeOut();
		//p.forgotPwd(); Reference check will fail.
		
	}

}
