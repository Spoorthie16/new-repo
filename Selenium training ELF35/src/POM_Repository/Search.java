package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public Search(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickOnSubmitButton;
	
	@FindBy(linkText="Name: Z to A")
	private WebElement clickOnDropDown;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement clickOnAddCart;

	public WebElement getClickOnAddCart() {
		return clickOnAddCart;
	}

	public WebElement getClickOnDropDown() {
		return clickOnDropDown;
	}

	public WebElement getClickOnSubmitButton() {
		return clickOnSubmitButton;
	}

	
}
