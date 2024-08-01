package prac.mda.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import prac.mda.pages.actions.LoginPage;
import prac.mda.pages.actions.TopNavigation;
import prac.mda.tools.SeleniumDriver;

public class LoginStep
{
	TopNavigation topNavigation = new TopNavigation();
	LoginPage loginPage;
	
	@Given("user navigates to Naukri website: {string}")
	public void user_navigates_to_naukri_website(String siteUrl) 
	{
		System.out.println("user navigates to Naukri website: " +siteUrl);
		SeleniumDriver.openPage(siteUrl);	
	}

	@Given("user validates the Homepage title: {string}")
	public void user_validates_the_homepage_title(String expectedTitle)
	{
		System.out.println("user validates the Homepage title");
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual Title: " +actualTitle);
		System.out.println("Expected Title: " +expectedTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@When("user opens the Login popup")
	public void user_opens_the_login_popup()
	{
		loginPage = topNavigation.goToLoginMenu();
		System.out.println("user opens the Login popup");		
	}

	@Then("user enters the {string} Username")
	public void user_enters_the_username(String userName)
	{
		loginPage.setUserName(userName);
		System.out.println("user enters the " +userName+ " Username");		
	}

	@Then("user enters the {string} Password")
	public void user_enters_the_password(String password)
	{
		loginPage.setPassword(password);
		System.out.println("user enters the " +password+ " Password");		
	}

	@Then("user clicks the Login button")
	public void user_clicks_the_login_button() throws InterruptedException 
	{
		loginPage.loginToSite();
		Thread.sleep(5000);
		System.out.println("user clicks the Login button");		
	}
	
	@Then("user enters skills")
	public void user_enters_skills(List<String> list)
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(String listItem : list)
		{
			System.out.println("user enters skills: " +listItem);	
		}
//		System.out.println("user enters skills: " +list.get(1));	
	}

	@Then("user enters experience and location")
	public void user_enters_experience_and_location(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		// List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		
		
		/* Code for Datatable as lists */
		
		List<List<String>> dataList = dataTable.asLists();
		System.out.println("Data from the Header - Experience: " +dataList.get(0).get(0));	// Header - Experience
		System.out.println("Data from the Header - Location: " +dataList.get(0).get(1));	// Header - Location
		System.out.println("Data from First list - Experience: " +dataList.get(1).get(0));	// First list - Experience
		System.out.println("Data from First list - Location: " +dataList.get(1).get(1));	// First list - Location
		System.out.println("Data from Second list - Experience: " +dataList.get(2).get(0));	// Second list - Experience
		System.out.println("Data from Second list - Location: " +dataList.get(2).get(1));		// Second list - Location
		
		/* Code for Datatable as Maps */

		List<Map<String,String>> dataMap = dataTable.asMaps();
		
		for (Map<String,String> dataValue : dataMap)
		{
			System.out.println("user enters the experience: " +dataValue.get("Experience"));	
			System.out.println("user enters the location: " +dataValue.get("Location"));
		}
		
		
		//System.out.println("user enters the experience: " +data.get(1).get("Experience"));	
		//System.out.println("user enters the location: " +data.get(1).get("Location"));
	}


	@Then("user {string} successfully logged in")
	public void user_successfully_logged_in(String action)
	{
		System.out.println("user " +action+ "  successfully logged in");		
	}

}
