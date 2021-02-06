package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.HomePage;

public class TestAppPage extends TestBase{
	HomePage homePageobject;
	AppsPage appsPageObject;
	@Test(priority=1)
	public void clickOnApps() throws InterruptedException
	{
		homePageobject = new HomePage(driver);
		
		homePageobject.apps_page();
		Thread.sleep(500);
		Assert.assertEquals(driver.getTitle(), "Android Apps on Google Play");
		
	}
	@Test(priority=2)
	public void selectItem()
	{
		appsPageObject =new AppsPage(driver);
		appsPageObject.selectFromCatigory("Education", "TED");
			
	}
	
	@Test(priority=3)
	public void selectApp()
	{
		appsPageObject =new AppsPage(driver);
		appsPageObject.selectTedApp();
	
		Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/details?id=com.ted.android&hl=en");
	}
	
	
	

}
