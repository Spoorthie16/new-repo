package Test_Scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.CommonPage;
import POM_Repository.LoginPage;
import POM_Repository.Search;
/***
 * 
 * @author spoorthi
 *
 */
public class TC_Search_005 extends BaseClass {
	@Test
	public void search() {
		//creating object for common page
	CommonPage common=new CommonPage(driver);
		/*common.getClickOnLoginLink().click();
		assertTrue(	common.getClickOnLoginLink().isDisplayed(),"user is not click on login link");
		Reporter.log("user click on login link successfully");

		//creating object for login page
		LoginPage login=new LoginPage(driver);
		login.getEnterEmail().sendKeys("spoorthie16101@gmail.com");
		assertTrue(	login.getEnterEmail().isDisplayed(),"user is not entering email");
		Reporter.log("user entered mail successfully");

		login.getEnterPasswrod().sendKeys("spoorthi@123");
		assertTrue(login.getEnterPasswrod().isDisplayed(),"user is not entering pwd");
		Reporter.log("user entered pwd successfully");

		login.getClickOnLoginButton().click();
		assertTrue(login.getClickOnLoginButton().isDisplayed(),"user is not clicking on login button ");
		Reporter.log("user click on login button successfully");*/


		common.getEnterSearchingElement().sendKeys("laptop");
		assertTrue(common.getEnterSearchingElement().isDisplayed(),"user is not enter serching elemnt");
		Reporter.log("user entered searching element successfully");

		Search search=new Search(driver);
		search.getClickOnSubmitButton().click();
		assertTrue(search.getClickOnSubmitButton().isDisplayed(),"user is not click on submit button");
		Reporter.log("user click on submit button successfully");


		//String actualresult = search.getClickOnSubmitButton().getText();
		//	String  expectedResult= "search";
		//	assertEquals(actualresult, expectedResult, "user click on search button not successfully");
		//	search.getClickOnSubmitButton().click();
		//System.out.println(expectedResult);

		//search.getClickOnDropDown().click();
		//search.getClickOnAddCart().click();

	}
}
