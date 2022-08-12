package assessment_works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelect_GetOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOK")).click();
		Select dropDown=new Select(driver.findElement(By.id("products-viewmode")));
		List<WebElement> options=dropDown.getOptions();
	for(WebElement text:options)	{
		System.out.println(text.getText());
		
		Select dropDown1=new Select(driver.findElement(By.id("products-orderby")));
		//List<WebElement> options1=dropDown1.get	}
	}
	}

}