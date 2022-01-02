package prac.mda.stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchJobStep
{
	@When("user opens the search page")
	public void user_opens_the_search_page()
	{
		System.out.println("User opens the search page");
	}

	@Then("user sees the relevant jobs")
	public void user_sees_the_relevant_jobs()
	{
		System.out.println("User sees the relevant jobs");
	}
}
