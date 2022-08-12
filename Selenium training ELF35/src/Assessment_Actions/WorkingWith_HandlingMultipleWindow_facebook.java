package Assessment_Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_HandlingMultipleWindow_facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		Thread.sleep(1000);
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String>child=driver.getWindowHandles();
		for(String child_Window:child) {
			driver.switchTo().window(child_Window);
			Thread.sleep(5000);
		driver.close();
		}
		
	}

}
