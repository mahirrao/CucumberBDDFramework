package prac.mda.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import prac.mda.pages.locators.LoginPageLocators;
import prac.mda.tools.SeleniumDriver;

public class LoginPage
{
	public LoginPageLocators login;
	private String userName;
	private String password;
	
//	public String getUserName()
//	{
//		return userName;
//	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
//	public String getPassword()
//	{
//		return password;
//	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public LoginPage()
	{
		this.login = new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.login);
	}

	public void loginToSite()
	{
		login.userName.sendKeys(userName);
		login.password.sendKeys(password);
		login.logInButton.click();
	}
	
	
}
