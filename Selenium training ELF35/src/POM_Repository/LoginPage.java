package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement EnterEmail;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement EnterPasswrod;

    
	@FindBy(xpath ="//input[text()='Log in']")
	private WebElement ClickOnLoginButton;

	
	public WebElement getClickOnLoginButton() {
		return ClickOnLoginButton;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getEnterPasswrod() {
		return EnterPasswrod;
	}
}
