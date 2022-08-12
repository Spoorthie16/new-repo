package Exce_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataProviderConcept.DataProvider;

	public class ReadDataFromExcelAndPassToTestCases extends Excel_Utility{
		@DataProvider
		public String[][] testData() throws InvalidFormatException, IOException  {
			String[][] dataFromExcel=Excel_Utility.readmultipleDataFromExcel("","data");
			return dataFromExcel;
			}
		@Test(dataProvider="DataProvider")
		public void readDataFromDataProvider(String[] arr) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.id("name")).sendKeys(arr[0]);
		driver.findElement(By.id("email")).sendKeys(arr[1]);
		driver.findElement(By.id("password")).sendKeys(arr[2]);
		driver.findElement(By.id("mobile")).sendKeys(arr[3]);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Register Now']")).click();
		driver.quit();
		
		}}

