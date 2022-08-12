package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locators {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.google.co.in");
	driver.get("http://demowebshop.tricentis.com/");
	
	//locator is linkText
	driver.findElement(By.linkText("Register")).click();
	
	//locator is id
	driver.findElement(By.id("FirstName")).sendKeys("spoorthi");
	//driver.close();
	}

}
