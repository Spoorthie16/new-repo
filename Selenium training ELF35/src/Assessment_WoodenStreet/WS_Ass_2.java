package Assessment_WoodenStreet;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WS_Ass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver1,5);
		
		

		driver1.get("https://www.woodenstreet.com");
		driver1.manage().window().maximize();
		WebElement ele =driver1.findElement(By.xpath("//a[contains(.,' Study & Office ')]"));
		Actions act=new Actions(driver1);
		act.moveToElement(ele).perform();

		driver1.findElement(By.xpath("//a[text()='Gaming Chairs']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver1;
		jse.executeScript("window.scrollBy(0,200)");

		String price = driver1.findElement(By.xpath("(//div[contains(@id,'article')])[3]//strong")).getText().replace("," ," ").replace("Rs ","");

		driver1.findElement(By.xpath("(//span[@class='cart-tooltip'])[1]")).click();
		ArrayList<String> brandlist=new ArrayList<>();
		brandlist.add(driver1.findElement(By.xpath("(//div[contains(@id,'article')])[1]//a[@class='by-brand']")).getText());
		int itemsInCart=1;
		for(int i=2;;i++) {
			if(itemsInCart==3)
				break;

			String xpath= "(//div[contains(@id,'article')])["+i+"]//a[@class='by-brand']"; 
			String brandname = driver1.findElement(By.xpath(xpath)).getText();
			if(brandlist.contains(brandname)) {
				continue;
			}
			else {
				brandlist.add(brandname);
				driver1.findElement(By.xpath("(//div[contains(@id,'article')])["+i+"]//span[@class='cart-tooltip']")).click();
				itemsInCart++;
			}
			System.out.println(itemsInCart);
		}
		jse.executeScript("window.scrollTo(0,0)");
		driver1.findElement(By.xpath("//a[@title='Cart']")).click();
		int[] price1 = new int[3];
		for(int i=1;i<4;i++) {
			String temp = driver1.findElement(By.xpath("(//div[@class='product-detail'])["+i+"]//strong")).getText().replace("Rs ","").replace(",","");
			Integer tempPrice= Integer.valueOf(temp);
			price1[i-1]=tempPrice;
			System.out.println(price1[i-1]);
		}
		if(price1[0]>price1[1]&& price1[0]<price1[2]) {
			driver1.findElement(By.xpath("(//p[contains(text(),'Remove')])[1]")).click();
			System.out.println("items sucessfully removed1");
		}else if(price1[1]>price1[0]&& price1[1]<price1[2]) {
			driver1.findElement(By.xpath("(//p[contains(text(),'Remove')])[2]")).click();
			System.out.println("items sucessfully removed2");
		}else if(price1[2]>price1[0]&& price1[2]<price1[1]) {
			driver1.findElement(By.xpath("(//p[contains(text(),'Remove')])[3]")).click();
			System.out.println("items sucessfully removed3");
		}
		//System.out.println("items sucessfully removed");

		//driver1.quit();
	}

	}


