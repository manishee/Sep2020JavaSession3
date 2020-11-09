//*************** Nov 5 _p2***************
package OOP_Interface_WebDriveExample;

public interface WebDriver extends SearchContext{
	
	public void get(String url);
	
	public String getTitle();
	
	public void click();
	
	public void sendKeys(String value);
	
	public void quit();

	
}
