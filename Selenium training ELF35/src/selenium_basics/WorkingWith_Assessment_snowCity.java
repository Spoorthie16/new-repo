package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_Assessment_snowCity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/contact-us/");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Directions']")).click();
		driver.switchTo().defaultContent();
		 
	
	}

}
