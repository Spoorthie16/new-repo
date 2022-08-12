package Assessment_WoodenStreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WS_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,5);
		
		
		
		 WebElement rd = driver.findElement(By.xpath("//a[.='Dining']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(rd).perform();
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()=' Iconic Chairs ']"))));
		 driver.findElement(By.xpath("//a[text()=' Iconic Chairs ']")).click();
		 //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='signup_popup_wrapper]"))));

		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,200)");
		  String priceofchair = driver.findElement(By.xpath("(//div[contains(@id,'article')])[3]//strong")).getText().replace("," ,"").replace("Rs ", "");
		  
		 if(Integer.valueOf(priceofchair)>5000)
		 {
		 	 System.out.println(priceofchair+"very costly!");
		 }
		  else {
		 	 driver.findElement(By.xpath("//div[contains(@id,'article')])[3]//span[@class='cart-tooltip']")).click();
		  }  
		 	 driver.quit();
		  
		 		
		 		
		 	
	}

}
