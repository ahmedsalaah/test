package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	// intialize main driver
	protected WebDriver driver;

	// create constuctor
	public PageBase(WebDriver driver) {
		// page factory to use POM
		PageFactory.initElements(driver, this);

	}

}
