package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedFeatures//",
		glue = {"stepDefinations"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"})
public class TaggedRunner extends AbstractTestNGCucumberTests{

}
