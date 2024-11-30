package page;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.driverSetUp;
import junit.framework.Assert;
import utility.CommonFunction;

public class WindowPage extends driverSetUp {
	
	
	String parentWindow ;
	String ChileWindow;

	public WindowPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[.=\"    click   \"]")
	WebElement clickButton;



	public void clickButton() {
		parentWindow = CommonFunction.getURL(driver);

		clickButton.click();
		
		CommonFunction.handlingWinow(driver);
		ChileWindow = CommonFunction.getURL(driver);
		
		System.out.println(parentWindow);
		System.out.println(ChileWindow);
		
		Assert.assertNotSame(parentWindow, ChileWindow);

	}

}
