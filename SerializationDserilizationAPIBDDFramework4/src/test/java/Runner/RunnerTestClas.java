package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue = "StepApi",
		dryRun = false,
		monochrome = true,
		tags = "@EmployeedataStep",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentAdapter:"}
		)
public class RunnerTestClas extends AbstractTestNGCucumberTests{

}
