package Test_Scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.CommonPage;
import POM_Repository.RegisterPage;

/***
 * 
 * @author spoorthi
 *
 */
public class TC_Register_002 extends BaseClass {
	@Test
	public void Register() {
		// Step 1: creating object for common page
		CommonPage commonPage = new CommonPage(driver);

		commonPage.getClickOnRegisterLink().click();
		assertTrue(commonPage.getClickOnRegisterLink().isDisplayed(), "registration link is not clicked");
		Reporter.log("clicked on registration link", true);

		// Step 2: creating object for registration page

		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.getEnterFemaleRB().click();
		Reporter.log("User clicked radio button successfully", true);
		assertTrue(registerPage.getEnterFemaleRB().isDisplayed(), "user not clicked on radiobutton");

		registerPage.getEnterFirstName().sendKeys("spoorthi");
		Reporter.log("User enter the firstname successfully", true);
		assertTrue(registerPage.getEnterFirstName().isDisplayed(), "user is not enter firstname");

		registerPage.getEnterLastName().sendKeys("E");
		Reporter.log("User enter last name successfully", true);
		assertTrue(registerPage.getEnterLastName().isDisplayed(), "iser is not enter lastr name");

		registerPage.getEnterEmail().sendKeys("spoorthie16101@gmail.com");
		Reporter.log("User enter the email id successfully", true);
		assertTrue(registerPage.getEnterEmail().isDisplayed(), "user is not enter email");

		registerPage.getEnterPassword().sendKeys("spoorthi@123");
		Reporter.log("User enter the password successfully", true);
		assertTrue(registerPage.getEnterPassword().isDisplayed(), "user is not enter pswd");

		registerPage.getEnterConfirmPassword().sendKeys("spoorthi@123");
		Reporter.log("User confirm the successfully", true);
		assertTrue(registerPage.getEnterConfirmPassword().isDisplayed(), "user is not entered confirm password");

		registerPage.getClickOnRigisterButton().click();
		Reporter.log("User click on registration button");
		assertTrue(registerPage.getClickOnRigisterButton().isDisplayed(), "user is not clicked on registration button");

	}

}
