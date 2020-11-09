package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP -- Constructor");
	}
	
	@Override
	public void title() {
		System.out.println("LP -- Title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
	}
	
	public void forgotPwd() {
		System.out.println("LP -- ForgotPwd");
	}

}
