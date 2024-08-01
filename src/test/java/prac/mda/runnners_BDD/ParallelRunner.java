package prac.mda.runnners_BDD;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/prac/mda/features"},
		glue = {"prac/mda/stepDefinitions"},
		monochrome = true,
		tags = "@smoke",// or @sanity or @regression",
		publish = true,
		plugin = {
				"html:target/cucumber-html-report/cucumber.html",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class ParallelRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();	
	}
}
