package RunnerLayer;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/FeatureFile"},
		glue= {"StepApi"},
		monochrome = true,
		dryRun = false
				)
public class RunnerTest extends AbstractTestNGCucumberTests{
}
