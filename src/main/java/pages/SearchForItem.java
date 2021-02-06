package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForItem extends PageBase{

	public SearchForItem(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gbqfq")
	WebElement searchForItem;
	
	@FindBy(xpath="//*[@id=\"gbqfb\"]/span")
	WebElement searchIcon;
	
	@FindBy(xpath="//*[@id=\"fcxH9b\"]/div[4]/c-wiz[2]/div/div[2]/div/c-wiz/c-wiz[1]/c-wiz/div/div[2]/div[1]/c-wiz/div/div/div[1]/div/div/a")
	WebElement faceBookIcon;
	
	public void searchForApp(String keyword) throws InterruptedException
	{
		searchForItem.click();
		searchForItem.sendKeys(keyword);
		searchIcon.click();
		Thread.sleep(500);
		faceBookIcon.click();
		
	}
	
}
