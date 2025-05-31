package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features= {"C:\\Users\\mayur\\eclipse-workspace\\BDD_Framework_Practice\\src\\test\\java\\FeatureFile"},
			glue= {"StepDefinition"}
			
			
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

	
	
}

