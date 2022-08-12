package CrossBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dataDriven.Base_Test;

public class Working_with_login extends Base_Test {
	@Test
	public void execute() {
		driver.findElement(By.id("login_Layer")).click();
	}
}
