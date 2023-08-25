package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepDefinations"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html",
				"rerun:target/failedScenario.txt"
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		/*
		 * "usage:target/reports/UsageReport", "json:target/report/JsonReport.json",
		 * "junit:target/report/JunitReport.xml"
		 */}
		)
public class MyTestRunner extends AbstractTestNGCucumberTests {
	
  
}
