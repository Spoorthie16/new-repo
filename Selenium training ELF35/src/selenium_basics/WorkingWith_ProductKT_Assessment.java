package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_ProductKT_Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("spoorthi");
		driver.findElement(By.name("LastName")).sendKeys("E");
		driver.findElement(By.name("Email")).sendKeys("spoorthie1610@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Spoorthi@16");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Spoorthi@16");
		driver.findElement(By.id("register-button")).click();
		driver.close();
		
	}

}
