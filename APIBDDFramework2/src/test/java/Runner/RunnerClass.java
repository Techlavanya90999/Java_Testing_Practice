package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue="StepApi",
		dryRun=true,
		monochrome=true,
		tags="@CustomerApi",
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

}

