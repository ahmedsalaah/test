package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	// this class responsable for setup driver
		public static WebDriver driver;
		@BeforeSuite
		public void startDrive()
		{
			String value;
			value = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", value);
			//take instance 
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.navigate().to("https://play.google.com/store?hl=en");
			System.out.println(driver.getTitle());
		}
		
		

}
