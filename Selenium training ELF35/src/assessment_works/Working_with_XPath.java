package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Selenium_Practice/xpath.html");
		driver.findElement(By.xpath("/html/body/input[@type='Username']")).sendKeys("spoorthi");
		driver.findElement(By.xpath("/html/body/input[@type='Password']")).sendKeys("spoo16");
		driver.findElement(By.xpath("/html/body/button[text()='SignOn']")).click();
	}

}
