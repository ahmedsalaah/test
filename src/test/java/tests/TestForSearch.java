package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchForItem;

public class TestForSearch extends TestBase {
	
	HomePage homePageobject;
	SearchForItem searchForItemObject;
	@Test
	public void testSearch() throws InterruptedException 
	{
		homePageobject = new HomePage(driver);
		searchForItemObject=new SearchForItem(driver);
		searchForItemObject.searchForApp("Facebook");
		Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en");
		
		
		
	}
}
