package Assessment_rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_SignIn_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,5);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Spoorthi");
		//driver.switchTo().frame(3);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']")));
		driver.findElement(By.tagName("body")).sendKeys("hi");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		String s1 = driver.findElement(By.xpath("//img[@id='captchaImg']")).getText();
		System.out.println(s1);
		
		//wait.until(expectedConditions.presenceOfElementLocated(By.xpath("")))

		//driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/../..")).sendKeys("hi");
	////body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/../.
	}

}
