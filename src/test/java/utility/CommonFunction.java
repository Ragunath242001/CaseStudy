package utility;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonFunction {
	
	
	public static void dropDown(WebElement element , String dropDownValue) {
		
		Select sc = new Select(element);
		List<WebElement> allOptions = sc.getOptions();
		for (WebElement optionele : allOptions) {
			if(optionele.getText().equals(dropDownValue)) {
				optionele.click();
				break;
			}	
		}	
	}
	

	public static String getURL(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}
	
	
	public static void handlingWinow(WebDriver driver) {
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println(allwindow);
		
		for (String allwindowvalue : allwindow) {
			
			
			System.out.println(allwindowvalue);
			
			
			if(allwindowvalue.equals(parentwindow)){
				System.out.println("INSIDE IF ");
				
			
			}
			else {
				System.out.println("else");
				driver.switchTo().window(allwindowvalue);
				break;
				
			}
		}
		
	}

}
