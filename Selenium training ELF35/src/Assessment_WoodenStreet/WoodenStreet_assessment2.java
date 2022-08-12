package Assessment_WoodenStreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WoodenStreet_assessment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,5);
		//String sc="5000";
		
		driver.get("https://www.woodenstreet.com/?gclid=CjwKCAjw2rmWBhB4EiwAiJ0mtZlitv6glAHQ4b1Lm1do5wAaRG7q8bvRzeIzoNOznJYlx09lvQmCCBoCG28QAvD_BwE");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement dining=driver.findElement(By.xpath("//a[text()=' Study & Office ']"));
		action.moveToElement(dining).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Gaming Chairs']")).click();
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();

		//action.moveToElement(gaming_chair).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'By ASE Gaming')])[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"cart-tooltip\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'By Adiko Systems')])[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"cart-tooltip\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'By Rekart')])[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"cart-tooltip\"])[29]")).click();

		//driver.findElement(By.xpath("(//span[@class=\"cart-tooltip\"])[29]")).click();
		//driver.findElement(By.xpath("//a[@title='Cart']")).click();
		//String price1=driver.findElement(By.xpath("(//div[@class='price'])[1]/strong")).getText();
		//System.out.println(price1);
		Thread.sleep(1000);
		/*String price2=driver.findElement(By.xpath("(//div[@class='price'])[2]/strong")).getText();
		System.out.println(price2);
		Thread.sleep(1000);
		String price3=driver.findElement(By.xpath("(//div[@class='price'])[3]/strong")).getText();
		System.out.println(price3);*/
		
		
	}

}
