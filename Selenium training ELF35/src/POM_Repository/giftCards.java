package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class giftCards {

	
		public giftCards(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
		private WebElement selectItem;
		public WebElement getselectItem() {
			return selectItem;
		}
		
		@FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
		private WebElement addToCart;
		public WebElement getAddToCart() {
			return addToCart;
		}
		
		@FindBy(xpath = "//input[@class='recipient-name']")
		private WebElement recipientName;
		
		public WebElement getSelectItem() {
			return selectItem;
		}

		public WebElement getRecipientName() {
			return recipientName;
		}

		public WebElement getRecipientEmail() {
			return recipientEmail;
		}

		public WebElement getSenderEmail() {
			return senderEmail;
		}

		public WebElement getSenderName() {
			return senderName;
		}
		@FindBy(xpath = "//input[@class='recipient-email']")
		private WebElement recipientEmail;
		
		@FindBy(xpath = "//input[@class='sender-email']")
		private WebElement senderEmail;
		
		@FindBy(xpath = "//input[@class='sender-name']")
		private WebElement senderName;
		
	}
