package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	public CommonPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText = "Books")
	private WebElement ClickOnBooksLink;

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement clickOnLoginLink;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement ClickOnRegisterLink;
	
	@FindBy(partialLinkText="Computers")
	private WebElement ClickOnComputer;
	
	@FindBy(id="small-searchterms")
	private WebElement EnterSearchingElement;
	
	@FindBy(partialLinkText="Gift Cards")
	private WebElement GiftCardlink;
	
	public WebElement getEnterSearchingElement() {
		return EnterSearchingElement;
	}

	public WebElement getClickOnLoginLink() {
		return clickOnLoginLink;
	}

	public WebElement getClickOnComputer() {
		return ClickOnComputer;
	}

	public WebElement getclickOnLoginLink() {
		return clickOnLoginLink;
	}

	public WebElement getClickOnBooksLink() {
		return ClickOnBooksLink;
	}

	public WebElement getClickOnRegisterLink() {
		return ClickOnRegisterLink;
	}

	public WebElement getGiftCardlink() {
		return GiftCardlink;
	}
}
