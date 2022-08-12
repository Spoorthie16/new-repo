package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Selenium_Practice/xpath1.html");
		driver.findElement(By.xpath("/html/body/div/input")).sendKeys("spoo");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("e");
		driver.findElement(By.xpath("/html/body/div[2]/input")).sendKeys("ty");
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("smg");
	}

}
