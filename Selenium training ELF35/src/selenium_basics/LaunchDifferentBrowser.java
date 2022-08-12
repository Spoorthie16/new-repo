package selenium_basics;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LaunchDifferentBrowser {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();
			System.out.println(title);
			System.out.println(title);
			String pagesource=driver.getPageSource();
			System.out.println(pagesource);
			driver.close();
		}

}
