package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","cc");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement drag=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement drop=driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement drop1=driver.findElement(By.xpath("(//div[text()='Norway'])"));
		action.dragAndDrop(drag1, drop1).build().perform();
		
		
		WebElement drag2=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement drop2=driver.findElement(By.xpath("//div[text()='United States']"));
		action.dragAndDrop(drag2, drop2).build().perform();

		
		WebElement drag3=driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
		WebElement drop3=driver.findElement(By.xpath("//div[text()='South Korea']"));
		action.dragAndDrop(drag3, drop3).build().perform();

		WebElement drag4=driver.findElement(By.xpath("//div[text()='Stockholm'][2]"));
		WebElement drop4=driver.findElement(By.xpath("//div[text()='Sweden']"));
		action.dragAndDrop(drag4, drop4).build().perform();

		WebElement drag5=driver.findElement(By.xpath("//div[text()='Madrid'][2]"));
		WebElement drop5=driver.findElement(By.xpath("//div[text()='Spain']"));
		action.dragAndDrop(drag5, drop5).build().perform();

		WebElement drag6=driver.findElement(By.xpath("//div[text()='Copenhagen'][2]"));
		WebElement drop6=driver.findElement(By.xpath("//div[text()='Denmark']"));
		action.dragAndDrop(drag6, drop6).build().perform();

		
	}

}
