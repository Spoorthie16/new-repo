package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWith_TC_Actitime_001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);

//open the browser enter the URL
		String testURL = "https://demo.actitime.com/login.do";
		driver.get(testURL);
		Thread.sleep(2000);
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		System.out.println(actualLoginPageTitle);
		if (expectedLoginPageTitle.equalsIgnoreCase(actualLoginPageTitle)) {
			System.out.println("login page is displayed succesfully");
		} else {
			System.out.println("login page is not displayed succesfully");
		}

//step2: enter the valid username and valid password
		String usernameData = "admin";
		String passwordData = "manager";
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(usernameData);
		String actualUserNameEntered = usernameTextField.getAttribute("value");
		if (usernameData.equals(actualUserNameEntered)) {
			System.out.println("username is entered successfully");
		} else {
			System.out.println("username is entered successfully");
		}
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(passwordData);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if (passwordData.equals(actualPasswordEntered)) {
			System.out.println("password is entered  successfully");
		} else {
			System.out.println("password is not entered  successfully");
		}

//step:3:click on login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		Thread.sleep(2000);
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		Thread.sleep(2000);
		if (expectedHomePageTitle.equalsIgnoreCase(actualHomePageTitle)) {
			System.out.println("home page is displayed successfully");
		} else {
			System.out.println("home page is not displayed successfully");
		}
//driver.quit();
	}
} 
