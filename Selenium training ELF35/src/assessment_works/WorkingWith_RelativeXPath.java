package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Selenium_Practice/xpath.html");
	    driver.findElement(By.xpath("//input[@type='Username']")).sendKeys("spoorthi");
	    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("e");
	    driver.findElement(By.xpath("//button[text()='SignOn']")).click();
	}

}
