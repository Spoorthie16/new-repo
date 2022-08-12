package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPAge {
	public BooksPAge(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='button'])[2]")
	private WebElement cart;
	
	@FindBy(linkText="Shopping cart")
	private WebElement clickOnShopingCartLink;
	
public WebElement getClickOnShopingCartLink() {
		return clickOnShopingCartLink;
	}

public WebElement getNameLink() {
		return nameLink;
	}
@FindBy(linkText="Computing and Internet")
private WebElement nameLink;

	public WebElement getCart() {
		return cart;
	
	}
	
}
