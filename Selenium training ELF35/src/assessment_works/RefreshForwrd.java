package assessment_works;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshForwrd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.co.in");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.close();
	}

}
