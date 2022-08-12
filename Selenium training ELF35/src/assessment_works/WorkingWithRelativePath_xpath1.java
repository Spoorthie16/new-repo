package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRelativePath_xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Selenium_Practice/xpath1.html");
	    driver.findElement(By.xpath("//input[1]")).sendKeys("chitte");
	    driver.findElement(By.xpath("//input[2]")).sendKeys("e");
	    driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("ty");
	    driver.findElement(By.xpath("//div[2]//input[2]")).sendKeys("sm");
	}

}
