package prac.mda.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProfileStep
{
	@Before ("@sanity")
	public void setUpSanity()
	{
		System.out.println("Launching the browser for SANITY");
	}
	
	@After ("@sanity")
	public void tearDownSanity()
	{
		System.out.println("Closing the browser for SANITY");
	}
	
	@When("user opens the edit profile page")
	public void user_opens_the_edit_profile_page()
	{
		System.out.println("user opens the Edit Profile page");
	}

	@Then("user skills are updated")
	public void user_skills_are_updated()
	{
		System.out.println("user skills are updated");
	}

	@When("user uploads the resume")
	public void user_uploads_the_resume()
	{
		System.out.println("user uploads the resume");
	}

	@Then("the user sees the updated resume")
	public void the_user_sees_the_updated_resume()
	{
		System.out.println("user sees the updated resume");
	}
}
