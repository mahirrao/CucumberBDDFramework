package prac.mda.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import prac.mda.pages.locators.HomePageLocators;
import prac.mda.tools.SeleniumDriver;

public class HomePage
{
	public HomePageLocators home;
	public HomePage()
	{
		this.home = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), home);
	}
	
	public void searchJobs(String searchKey, String location)
	{
		home.searchText.sendKeys(searchKey);
		home.locationText.sendKeys(location);
		home.searchButton.click();
	}
	
//	Go to Flight and Hotel packages
	
	public void goToPackages()
	{
		
	}
	
	public void bookAFlight(String from, String to, String departingDate, String returnDate,
			String adultsNumber, String childrenNumber)
	{
		
	}
	
	public void bookAFlight(String from, String to, String departingDate,
			String adultsNumber, String childrenNumber)
	{
		
	}
}
