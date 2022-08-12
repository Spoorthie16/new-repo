package assessment_works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWIthSelectorClass_withMultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement dropDown=driver.findElement(By.id("products-orderby"));
		Select option=new Select(dropDown);
		List<WebElement> options=option.getOptions();
		for(int i=1;i<options.size();i++) {
			WebElement sort_by=driver.findElement(By.id("products-orderby"));
			Select sel=new Select(sort_by);
	List<WebElement> values=sel.getOptions();
	//System.out.println(values);
		}
		
		
	}
	

}
