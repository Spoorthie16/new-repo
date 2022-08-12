package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("java");
		String value=driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).getAttribute("value");
	System.out.println(value);
		if(value.equalsIgnoreCase("search")) {
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
	}
		String value1=driver.findElement(By.cssSelector("strong[class='result']")).getText();
		System.out.println(value1);
		driver.close();
		
	}
		
	

}
