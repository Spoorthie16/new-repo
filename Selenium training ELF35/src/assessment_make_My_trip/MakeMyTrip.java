package assessment_make_My_trip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MakeMyTrip {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		FileInputStream fis=new FileInputStream("./testData/TestData_MMT.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);

		String from = workbook.getSheet("makeMyTrip").getRow(1).getCell(2).getStringCellValue();
		String to = workbook.getSheet("makeMyTrip").getRow(1).getCell(3).getStringCellValue();

		System.out.println(from);
		WebElement fromDropDown = driver.findElement(By.id("fromCity"));
	//	Select select=new Select(fromDropDown);
	//	select.selectByVisibleText("Mumbai");
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(from);
		Actions action=new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//li[@role='option'][1]"))).click().perform();
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru, India");
		action.moveToElement(driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"))).click().perform();
	}
}
