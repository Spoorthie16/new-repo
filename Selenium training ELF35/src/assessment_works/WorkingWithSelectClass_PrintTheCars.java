package assessment_works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSelectClass_PrintTheCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
		List<WebElement> cars=driver.findElements(By.id("standard_cars"));
		for(WebElement web:cars) {
			System.out.println(web.getText());
			
		}

	}

}
