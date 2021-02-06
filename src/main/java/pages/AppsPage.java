package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AppsPage extends PageBase{

	public AppsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"action-dropdown-parent-Categories\"]/span[1]")
	WebElement catigoryList;
	
	
	@FindBy(id="gbqfq")
	WebElement searchTxt;
	
	@FindBy(xpath="//*[@id=\"gbqfb\"]/span")
    WebElement searchIcon;
	
	@FindBy(xpath="//*[@id=\"fcxH9b\"]/div[4]/c-wiz[3]/div/div[2]/div/c-wiz/c-wiz/c-wiz/div/div[2]/div[1]/c-wiz/div/div/div[1]/div/div/a")
	WebElement selectTed;
	
	@FindBy(xpath="//*[@id=\"fcxH9b\"]/div[4]/c-wiz[3]/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[1]/div/img")
	WebElement successMessage;
	
	public void selectFromCatigory(String catigoryValue,String searchKey)
	{
		catigoryList.click();	
		searchTxt.click();
		searchTxt.sendKeys(searchKey);
		searchIcon.click();
	}
	
	public void selectTedApp()
	{
		selectTed.click();
		
	}
	
}
