package Assessment_WoodenStreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWith_WoodenStreet_1 {

	                                                                
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,5);
		String sc="5000";
		
		driver.get("https://www.woodenstreet.com/?gclid=CjwKCAjw2rmWBhB4EiwAiJ0mtZlitv6glAHQ4b1Lm1do5wAaRG7q8bvRzeIzoNOznJYlx09lvQmCCBoCG28QAvD_BwE");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement dining=driver.findElement(By.xpath("//a[text()='Dining']"));
		action.moveToElement(dining).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Iconic Chairs ']")).click();
	 String price=driver.findElement(By.xpath("(//div[@class=' col '])[3]/div[1]/strong")).getText();
	 System.out.println(price);
	 
	 String s="";
	 for(int i=0;i<price.length();i++) {
		 if(Character.isDigit(price.charAt(i))){
			 s=s+price.charAt(i);
			 //System.out.println(s);
		 }
		 
	 }
	 Thread.sleep(3000);
	int d=Integer.parseInt(s);
	int d1=5000;
	 if(d<d1) {
	WebElement cart_click=driver.findElement(By.xpath("(//div[@class=' col '])[3]//span[@class='cart-tooltip']"));
	action.doubleClick(cart_click).doubleClick().build().perform();
	Thread.sleep(2000);
	System.out.println("successfully addedd to cart");
	 }
	 else {
		 System.out.println("price is high");
	 }
	driver.quit();
	}
	

	
}
