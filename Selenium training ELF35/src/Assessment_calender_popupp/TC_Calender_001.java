package Assessment_calender_popupp;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Calender_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);

		Actions action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,80);");
		Thread.sleep(2000);
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		int years = ldt.getYear();
		int day = ldt.getDayOfMonth();
		System.out.println(ldt);
		System.out.println(years);
		System.out.println(day);
		Thread.sleep(2000);
		String monthvalue = ldt.getMonth().toString();
		//String month = "" + monthvalue.substring(0, 1).toUpperCase() + monthvalue.substring(1, monthvalue.length());
		Thread.sleep(2000);
		for (;;) {
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath("//div[text()='" + monthvalue  + " " + years + "']/../..//p[text()='" + day + "']")).click();
				Thread.sleep(2000);

				break;

			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
			}
		}
		Thread.sleep(2000);
		System.out.println(years);

	}

}
