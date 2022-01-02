package prac.mda.runnners_BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/prac/mda/features"}
		, glue = {"prac/mda/stepDefinitions"}
		, monochrome = true
		, tags = "@smoke or @sanity or @regression"
		, plugin = {"pretty", "html:reports/Cucumber.html"}
		)
public class RunCuke
{

}
