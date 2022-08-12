package RoboClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement file_btn=driver.findElement(By.id("resume"));
		Actions action=new Actions(driver);
		action.moveToElement(file_btn).click().perform();
		Thread.sleep(2000);
		
		//Object for robot class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		for(int i=0;i<=2;i++) {
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//driver.close();
	//Point p=driver.findElement(By.id("resume")).getLocation();
	//System.out.println(p);
	
		Thread.sleep(1000);
		robot.mouseMove(770,700);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		for(int i=0;i<=2;i++) {
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
		
	
}
