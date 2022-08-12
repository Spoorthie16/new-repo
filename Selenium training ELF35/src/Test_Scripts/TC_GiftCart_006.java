package Test_Scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.CommonPage;
import POM_Repository.LoginPage;
import POM_Repository.giftCards;

public class TC_GiftCart_006 extends BaseClass{

	@Test
	public void TestScript_003() throws InterruptedException {
		//creating object of common page
		CommonPage common=new CommonPage(driver);
		common.getClickOnLoginLink().click();
		assertTrue(	common.getClickOnLoginLink().isDisplayed(),"user is not clicked on login link");
		Reporter.log("User click on login link successfully",true);

		// creating object of login page
		LoginPage log=new LoginPage(driver);
		log.getEnterEmail().sendKeys("spoorthie16101@gmail.com");
		assertTrue(	log.getEnterEmail().isDisplayed(),"user is not enter email");
		Reporter.log("User enter email successfully",true);

		log.getEnterPasswrod().sendKeys("spoorthi@123");
		assertTrue(	log.getEnterPasswrod().isDisplayed(),"user is not enter pwd");
		Reporter.log("User is enter pwd successfully",true);

		log.getClickOnLoginButton().click();
		assertTrue(	log.getClickOnLoginButton().isDisplayed(),"user is not clicked on login button");
		Reporter.log("User click on login button successfully",true);


		common.getGiftCardlink().click();
		assertTrue(	common.getGiftCardlink().isDisplayed(),"user is not clicked on gift card link");
		Reporter.log("User click on gift card link successfully",true);

		//creating object for gift cards
		giftCards gc=new giftCards(driver);
		gc.getselectItem().click();
		assertTrue(gc.getselectItem().isDisplayed(),"user is not select the item");
		Reporter.log("User select the item successfully",true);


		gc.getRecipientName().sendKeys("spoorthi");
		assertTrue(gc.getRecipientName().isDisplayed(),"user is not enter the recipient name");
		Reporter.log("User enter the recipient name successfully",true);

		gc.getRecipientEmail().sendKeys("spoorthie1610@gmail.com");
		assertTrue(gc.getRecipientEmail().isDisplayed(),"user is not enter recipient email");
		Reporter.log("User enter the recipient mail successfully",true);

		//object creation for action class
		Actions act=new Actions(driver);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		gc.getAddToCart().click();
		assertTrue(	gc.getAddToCart().isDisplayed(),"user is not click on add to cart");
		Reporter.log("User click on add to cart successfully",true);

	}
}

