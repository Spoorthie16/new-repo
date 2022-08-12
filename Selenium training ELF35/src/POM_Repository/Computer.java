package POM_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer {
	WebDriver driver;
	public Computer(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	private WebElement clickOnAddToCart;
	
	public WebElement getClickOnAddToCart() {
	return clickOnAddToCart;
	}
	@FindBy(xpath="//img[@title='Show products in category Desktops']")
	private WebElement clickOnImg;
	
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement ClickOnAddCart;
	
	@FindBy(linkText="Shopping cart")
	private WebElement ClickOnShopingCartLink;

public WebElement ClickOnCheckBox(String checkBox) {
return	driver.findElement(By.xpath("//a[@class='product-name' and text()='Health Book']/../..//input[@type='checkbox']"));
}


	public WebElement getClickOnShopingCartLink() {
		return ClickOnShopingCartLink;
	}

	public WebElement getClickOnAddCart() {
		return ClickOnAddCart;
	}

	public WebElement getClickOnImg() {
		return clickOnImg;
	}

	
}
