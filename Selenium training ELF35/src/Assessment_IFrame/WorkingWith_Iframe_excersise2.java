package Assessment_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_Iframe_excersise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.get("file:///C:/Users/Dell/Downloads/iframe.html");
		
		Thread.sleep(1000);
		driver.switchTo().frame("FR1");
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		driver.switchTo().defaultContent();
	}

} 
