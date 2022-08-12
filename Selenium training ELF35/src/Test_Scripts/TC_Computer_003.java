package Test_Scripts;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.CommonPage;
import POM_Repository.Computer;
import POM_Repository.LoginPage;
/**** 
 * 
 * @author Spoorthi
 *
 */
public class TC_Computer_003 extends BaseClass {
	@Test
	public void computer() throws InterruptedException {
		CommonPage common = new CommonPage(driver);
		common.getclickOnLoginLink().click();
		assertTrue(common.getclickOnLoginLink().isDisplayed(),"user clicked on login link");
		Reporter.log("User clicked on loginlink successfully",true);


		//Step 2: Creating object for login page
		LoginPage loginpage = new LoginPage(driver);

		loginpage.getEnterEmail().sendKeys("spoorthie16101@gmail.com");
		assertTrue(loginpage.getEnterEmail().isDisplayed(),"user is not entered mail");
		Reporter.log("User enter the email id successfully",true);

		loginpage.getEnterPasswrod().sendKeys("spoorthi@123");
		assertTrue(	loginpage.getEnterPasswrod().isDisplayed(),"user is not entered pswd");
		Reporter.log("User enter the passwrod successfully",true);

		loginpage.getClickOnLoginButton().click();
		assertTrue(loginpage.getClickOnLoginButton().isDisplayed(),"user is not click on login button");
		Reporter.log("User clicked on login button successfully",true);



		common.getClickOnComputer().click();
		assertTrue(common.getClickOnComputer().isDisplayed(),"user is not click on computer");
		Reporter.log("User clicked on computer successfully",true);


		//creating obejct for computer
		Computer computer = new Computer(driver);
		computer.getClickOnImg().click();
		assertTrue(computer.getClickOnImg().isDisplayed(),"user is not click on img");
		Reporter.log("User clicked on img successfully",true);
		computer.getClickOnAddToCart().click();
		assertTrue(computer.getClickOnAddToCart().isDisplayed(),"user is not click on add to cart");
		Reporter.log("User clicked on add to cart successfully",true);
		computer.getClickOnAddCart().click();
		assertTrue(computer.getClickOnAddCart().isDisplayed(),"user is not click on add to cart ");
		Reporter.log("User clicked on add to cart in cart page successfully",true);
		Thread.sleep(3000);
		computer.getClickOnShopingCartLink().click();
		assertTrue(computer.getClickOnShopingCartLink().isDisplayed(),"user is not click on shopping cart link");
		Reporter.log("User clicked on shopping cart link  successfully",true);
	}

}
