package Maven_One.MavProject;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Projecy extends BaseClass {
//	public static void main(String[] args) {
	@Test
	public void name() {
		browser("chrome");
		geturl("https://www.facebook.com/login/");
		WebElement emailid = element("id","email");
		Input(emailid,"prabhube");
		WebElement pass = element("id","pass");
		Input(pass, "prem2334");
		WebElement login = element("name","login");
		click(login);
		
		
	}
	
	
	
	
}
	


