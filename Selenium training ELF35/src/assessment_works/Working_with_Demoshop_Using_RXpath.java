package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Demoshop_Using_RXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("shashank");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("goodboy");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shashank@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("masterAtDeveloping");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("masterAtDeveloping");
		driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
		//driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
	}

}
