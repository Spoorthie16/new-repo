package dataDriven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Base_Script extends Base_Test {
	@Test
	public void execute() {
		driver.findElement(By.id("login_Layer")).click();
	}
}
