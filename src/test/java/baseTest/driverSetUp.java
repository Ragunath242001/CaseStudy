package baseTest;

import org.openqa.selenium.WebDriver;

import utility.FileRead;
import utility.FileRead.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverSetUp {

	public static WebDriver driver;

	public void setUpBrowser(String filename , String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(FileRead.propertiesFileRead(filename, url));
	}

	
	public void tearDownBrowser() {
		// driver.close();
	}

}
