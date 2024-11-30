package TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.driverSetUp;
import page.WindowPage;
import utility.CommonFunction;

public class WindowTest extends driverSetUp {
	
	@BeforeMethod
	public void browserSetUp() {
		setUpBrowser("config", "windowURL");
		
	}
	
	@AfterTest
	public void browserClose() {
		tearDownBrowser();
	}
	
	
	@Test
	public void handlingWinows() {
		
		WindowPage obj = new WindowPage();
		obj.clickButton();
		
	
		
		
		
		
	}
	

}
