package OOP_Interface_WebDriveExample;

public class AmazonTest {

	public static void main(String[] args) {

		//cross browser testing - top casting
		
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=null;
		
		String browser="opera";
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}else {
			System.out.println("please pass the correct browser name " + browser);
		}	
			
		driver.get("http://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement("username");
		driver.sendKeys("admin@gmail.com");
		
		driver.findElement("password");
		driver.sendKeys("admin@123");
		
		driver.findElement("login button");
		driver.click();
		
		driver.quit();
	
		
	}

}
