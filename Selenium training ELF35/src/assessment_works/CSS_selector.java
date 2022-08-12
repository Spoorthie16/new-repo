package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("label[for='pollanswers-1']")).click();
		driver.findElement(By.cssSelector("label[for='pollanswers-2']")).click();
		driver.findElement(By.cssSelector("label[for='pollanswers-3']")).click();
		driver.findElement(By.cssSelector("label[for='pollanswers-4']")).click();
		driver.findElement(By.cssSelector("input[value='Vote']")).click();
		
		
	}

}
