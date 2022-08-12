package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File absPath = new File("./testData/testData.properties");
		FileInputStream fis = new FileInputStream(absPath);

//step:1 create object of input stream
		Properties properties = new Properties();
		properties.load(fis);

//read method
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String key = properties.getProperty("key");
		String value = properties.getProperty("value");

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
