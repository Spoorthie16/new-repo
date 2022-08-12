package Assessment_Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWith_HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
		
		//to store the parent window ID
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		Thread.sleep(1000);
		
		//stsmt which opens child window
		driver.findElement(By.xpath("//a[text()='Webshop']")).click();
		Set<String> Child_window=driver.getWindowHandles();
		for(String childwindow:Child_window) {
			//System.out.println(childwindow);
			driver.switchTo().window(childwindow);
			if(driver.getTitle().contains("Web")) {
				driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();		
	}

}
