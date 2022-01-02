package prac.mda.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import prac.mda.pages.locators.TopNavigationLocators;
import prac.mda.tools.SeleniumDriver;

public class TopNavigation
{
	public TopNavigationLocators topNavigation;
	public TopNavigation()
	{
		this.topNavigation = new TopNavigationLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.topNavigation);
	}
	
	public LoginPage goToLoginMenu()
	{
		topNavigation.logInMenu.click();
		return new LoginPage();
	}
		
	public void openMyNaukri()
	{

	}

	public void openJobs()
	{

	}

	public void openRecruiters()
	{

	}

	public void openCompanies()
	{

	}

	public void openTools()
	{

	}

	public void openServices()
	{

	}

	public void openMore()
	{

	}

	public void openNotifications()
	{

	}
}
