package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement EnterMaleRB;

	@FindBy(id = "gender-female")
	private WebElement EnterFemaleRB;

	@FindBy(id = "FirstName")
	private WebElement EnterFirstName;

	@FindBy(id = "LastName")
	private WebElement EnterLastName;

	@FindBy(id = "Email")
	private WebElement EnterEmail;

	@FindBy(name = "Password")
	private WebElement EnterPassword;

	@FindBy(name = "ConfirmPassword")
	private WebElement EnterConfirmPassword;
	
	@FindBy(name="register-button")
	private WebElement ClickOnRigisterButton;

	public WebElement getClickOnRigisterButton() {
		return ClickOnRigisterButton;
	}

	public WebElement getEnterMaleRB() {
		return EnterMaleRB;
	}

	public WebElement getEnterFemaleRB() {
		return EnterFemaleRB;
	}

	public WebElement getEnterFirstName() {
		return EnterFirstName;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getEnterConfirmPassword() {
		return EnterConfirmPassword;
	}

}
