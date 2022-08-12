package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_SBI_001 {    //testNG class

	final int a=3;
	//final double=2.8;
	@Test//By default priority will be zero
	public void demoTest() {    //test case
	Reporter.log("from demoTest test case",false);
	                      //testSteps
	}
@Test(dependsOnMethods="secondTest")
	public void sampleTest() {   //test case
		Reporter.log("from sample test case",true);
	}
	@Test(enabled=true)
		public void firsttest() {  //test case
		
				Reporter.log("From first tet test case",true);
				//test step
	}
@Test
	public void secondTest() {    //test case
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Reporter.log("from second test case",true);
			//test case
	}
}

		

