package dataProviderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_dw_Login {
@DataProvider(name="testDataForCreadentials")
	public String[][] credentials(){
		String[][] srr= {
				          {"thanu","shree","msg4thanu@gmail.com","thanushree@18","thanushree@18"},
				         {"spoorthi","E","spoorthi1610@gmail.com","8088963604e","8088963604e"},
				          {"raj","kumar","rajuraju@somemail.com","rajuraj","rajuraj"},
				          {"shshank","SG","shshank@gmail.com","huchha","huchha"},
				          {"priya","GM","priyanka@gmail.com","hihello","hihello"}
				        };
		
		return srr;
		}
	@Test(dataProvider="testDataForCreadentials")
	public void loginWithMultipleCredentials(String[] arr) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("succesfully launched browser");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(arr[0]);
		driver.findElement(By.id("LastName")).sendKeys(arr[1]);
		driver.findElement(By.id("Email")).sendKeys(arr[2]);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(arr[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[4]);
		driver.findElement(By.id("register-button")).click();
		
	}
}
