package prac.mda.stepDefinitions;

import io.cucumber.java.Before;
import prac.mda.tools.SeleniumDriver;

public class BeforeActions
{
	@Before
	public void setUp()
	{
		System.out.println("Launching the browser");
		SeleniumDriver.setDriver();
	}
	
	@Before("@smoke")
	public void setUpSmoke()
	{
		System.out.println("Launching the browser before smoke");
//		SeleniumDriver.setDriver();
	}
}
