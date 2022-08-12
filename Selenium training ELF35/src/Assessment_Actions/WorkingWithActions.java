package Assessment_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.id("small-searchterms"))).click().sendKeys("mobiles").build().perform();
		
		
	}

}
