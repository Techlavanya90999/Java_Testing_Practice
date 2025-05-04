package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= { "src/test/java/FeatureFile" },
		glue= {"StepApi"},
		dryRun=false,
		monochrome=true,
		tags = "@Customers",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class Runnerclass extends AbstractTestNGCucumberTests{

}

