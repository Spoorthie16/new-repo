package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	public ShoppingCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	public WebElement getClickOnSC() {
		return ClickOnSC;
	}
	@FindBy(linkText="Shopping cart")
	private WebElement ClickOnSC;
	
}
