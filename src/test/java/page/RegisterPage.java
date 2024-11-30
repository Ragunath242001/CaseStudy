package page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.CommonFunction.*;

import baseTest.driverSetUp;

public class RegisterPage extends driverSetUp {

	public RegisterPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
	WebElement elefirstName;

	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	WebElement eleLastName;

	@FindBy(xpath = "//input[@type=\"email\" and @ng-model=\"EmailAdress\"]")
	WebElement eleemailId;

	@FindBy(id = "Skills")
	WebElement eleSkillDropDown;

	public void fillFirstName() {
		elefirstName.sendKeys("firstName");

	}

	public void fillLastName() {
		eleLastName.sendKeys("lastName");
	}

	public void fillEmailId() {
		eleemailId.sendKeys("empty@gmail.com");
	}

	public void selectSkill(String dropDownValue) {

		utility.CommonFunction.dropDown(eleSkillDropDown, dropDownValue);

	}
	
	

}
