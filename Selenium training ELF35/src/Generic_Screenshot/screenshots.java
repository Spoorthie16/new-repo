package Generic_Screenshot;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class screenshots {

	public static void getPhoto(WebDriver driver) {
		LocalDateTime systemDate=LocalDateTime.now();
		String ScreenshotData=systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenshots = (TakesScreenshot)driver;
		java.io.File temFile = takeScreenshots.getScreenshotAs(OutputType.FILE);
	 File destFile = new File("./error"+ScreenshotData + ".png");
	try {
	 FileUtils.copyFile(temFile,destFile);
	}catch(IOException e) {
		e.printStackTrace(); 
	}
		
	}
}
