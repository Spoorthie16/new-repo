package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_locator {

	
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		//locator is linkText
		driver.findElement(By.linkText("Register")).click();
		
		//locator is id
		driver.findElement(By.id("FirstName")).sendKeys("spoorthi");
		//driver.close();
		//locator is id
		driver.findElement(By.id("LastName")).sendKeys("E"); 
	}

}
