package assessment_dependentXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithdependentXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
		driver.findElement(By.xpath("//table[@name='selenium']/tbody/tr[4]/td[2]/input[@name='download']")).click();
	}

}
