package TestScript;

import org.testng.annotations.*;

import baseTest.driverSetUp;
import page.RegisterPage;

public class RegisterTest extends driverSetUp {

	RegisterPage obj;
	
	
	@BeforeMethod
	public void browserSetUp() {
		setUpBrowser("config", "url");
		
	}
	
	@AfterTest
	public void browserClose() {
		tearDownBrowser();
	}

	@Test
	public void inputBox() {

		obj = new RegisterPage();
		obj.fillFirstName();
		obj.fillLastName();
		obj.fillEmailId();
		obj.selectSkill("CSS");

	}
	
	
}
