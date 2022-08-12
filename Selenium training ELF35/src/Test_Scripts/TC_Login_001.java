package Test_Scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.CommonPage;
import POM_Repository.LoginPage;
/***
 * 
 * @author spoorthi
 *
 */
public class TC_Login_001 extends BaseClass {
	@Test
	public void login() {
		//Step 1:creating object for common page
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
	}

	//	private void assertTrue(boolean displayed, String string) {
	// TODO Auto-generated method stub


}
