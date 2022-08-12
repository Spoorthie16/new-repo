package Test_Scripts;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GeneralLibrary.BaseClass;
import POM_Repository.BooksPAge;
import POM_Repository.CommonPage;
/***
 * 
 * @author spoorthi
 *
 */
public class TC_Books_004 extends BaseClass {
	@Test
	public void books() throws InterruptedException {
		//creating object for common class
		CommonPage common = new CommonPage(driver);
		common.getClickOnBooksLink().click();
		assertTrue(common.getClickOnBooksLink().isDisplayed(),"user clicked on books link");		
		Reporter.log("User clicked on books link successfully",true);

		//creating object for bookspage
		BooksPAge books = new BooksPAge(driver);
		books.getNameLink().click();
		assertTrue(books.getNameLink().isDisplayed(),"user clicked on name link");		
		Reporter.log("User clicked on name link successfully",true);


		books.getCart().click();
		assertTrue(books.getCart().isDisplayed(),"user clicked on cart");		
		Reporter.log("User clicked on cart successfully",true);
		Thread.sleep(3000);
		books.getClickOnShopingCartLink().click();
		assertTrue(books.getClickOnShopingCartLink().isDisplayed(),"user clicked on shopping cart");		
		Reporter.log("User clicked on shopping cart successfully",true);
	}
}
