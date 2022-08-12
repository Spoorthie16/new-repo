package assessment_works;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSelectClass_dropdown_Mynthra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googmantxtmob50-21&ascsubtag=_k_EAIaIQobChMIxOjqy83e-AIVUqaWCh3DEgmWEAAYASAAEgInDvD_BwE_k_&gclid=EAIaIQobChMIxOjqy83e-AIVUqaWCh3DEgmWEAAYASAAEgInDvD_BwE");
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' slippers']")).click();
	}

}
