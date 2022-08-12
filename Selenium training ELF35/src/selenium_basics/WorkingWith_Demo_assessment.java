package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_Demo_assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		 
		/*Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();*/
		
		driver.findElement(By.xpath("//div[@class='item-box'][2]//input[@type='button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='item-box'][3]//input[@type='button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	Thread.sleep(6000);
	driver.findElement(By.linkText("Shopping cart")).click();
	Thread.sleep(2000);
	String text=driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
System.out.println(text);
String text1=driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();
System.out.println(text1);
double a=Double.parseDouble(text);
System.out.println(a);
double b=Double.parseDouble(text1);
if(a>b) {
	driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click();
}
else
{
	driver.findElement(By.xpath("(//input[@name='removefromcart'])[2]")).click();
}
driver.findElement(By.name("updatecart")).click();
	}

}
