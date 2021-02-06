package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	public HomePage(WebDriver driver) 
	{
		super(driver);

	}
	
	
	    // to find element of Dashboard by anotation
		@FindBy(xpath="//*[@id=\"fcxH9b\"]/div[1]/c-wiz[1]/ul/li[2]/a/span/span[1]")
		WebElement appsBtn;
		public void apps_page()
		{
			appsBtn.click();
		}
		

}
