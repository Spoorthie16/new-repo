package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excersise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.co.in");
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("computer");
		String v1=driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).getAttribute("value");
		if(v1.equalsIgnoreCase("search"));
		{
			driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		}
		String v2=driver.findElement(By.cssSelector("strong[class='result']")).getText();
			System.out.println(v2);
		}
		
}
