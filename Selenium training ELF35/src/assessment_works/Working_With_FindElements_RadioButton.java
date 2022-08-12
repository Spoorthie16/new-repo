package assessment_works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Working_With_FindElements_RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> radioButton=driver.findElements(By.xpath("//input[@type='radio']"));
		
		//Using for each loop
		//for(WebElement Element:radioButton) {
		//	Element.click();
		
		//Using for loop
		for(int i=0;i<radioButton.size();i++) {
			radioButton.get(i).click();
			
			
		}
	}

}
