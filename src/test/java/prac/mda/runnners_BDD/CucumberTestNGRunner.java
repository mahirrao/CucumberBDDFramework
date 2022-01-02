package prac.mda.runnners_BDD;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
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
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests
{

}
