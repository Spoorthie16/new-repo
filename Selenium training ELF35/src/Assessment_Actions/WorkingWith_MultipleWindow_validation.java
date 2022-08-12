package Assessment_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_MultipleWindow_validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Thread.sleep(1000);
		WebElement companies=driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions action=new Actions(driver);
		action.moveToElement(companies).build().perform();
		Thread.sleep(2000);
		WebElement companies1=driver.findElement(By.xpath("//a[text()='Unicorn']"));
if(companies1.equals("Unicorns actively hiring")) {
	driver.close();
}
	
	}


}
