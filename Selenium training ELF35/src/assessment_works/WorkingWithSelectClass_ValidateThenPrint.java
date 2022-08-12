package assessment_works;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WorkingWithSelectClass_ValidateThenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
		driver.findElement(By.partialLinkText("standard_cars")).click();
		
	//String value1=driver.findElement(By.name("products-orderby")).getText();
		//System.out.println(value1);
		//String v1=value1.getText();
		//System.out.println(v1);*/
		//Select selectProd=new Select(value1);
		//System.out.println(selectProd());
		
		//if(value1.equals("http://demowebshop.tricentis.com/books?orderby=10"));{
		//	System.out.println();
		//}
		//Select s1=new Select(value1);
		//List<WebElement> s=s1.selectByValue("http://demowebshop.tricentis.com/books?orderby=5");
		
		
	}

}
