package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelect_Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	WebElement daydropdown=driver.findElement(By.id("day"));
	Select select=new Select(daydropdown);
	select.selectByIndex(5);
	Thread.sleep(1000);
	WebElement mothDD=driver.findElement(By.id("month"));
	Select selectMonth=new Select(mothDD);
	selectMonth.selectByValue("5");
	Thread.sleep(1000);
	WebElement yearDD=driver.findElement(By.id("year"));
	Select selectYear=new Select(yearDD);
	selectYear.selectByIndex(7);
	}

}
