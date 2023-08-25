import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepDefinations"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"})
public class ParallelExicution extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=true)
	public Object[][]scenario(){
		return super.scenarios();
	}
	

	
}
