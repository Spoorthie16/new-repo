package assessment_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetText_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		WebElement register_link=driver.findElement(By.cssSelector("a[class='ico-register']"));
		String value1=register_link.getText();
		System.out.println(value1);
		
		
		//method chaining
		String value11=driver.findElement(By.cssSelector("a[class='ico-register']")).getText();
		System.out.println(value11);
		
		String value12=driver.findElement(By.cssSelector("a[class='ico-cart']")).getText();
		System.out.print(value12);
		
		String value13=driver.findElement(By.cssSelector("a[class='ico-login']")).getText();
		System.out.println(value13);
		
		String value14=driver.findElement(By.cssSelector("a[class='ico-wishlist']")).getText();
		System.out.println(value14);
		
		String value15=driver.findElement(By.cssSelector("li[class='answer']")).getText();
		System.out.println(value15);
		
		String value16=driver.findElement(By.cssSelector("div[class='title']")).getText();
		System.out.println(value16);
		
		//String value17=driver.findElement(By.cssSelector("input[class='Vote']")).getText();
		//System.out.println(value17);
	}

}
