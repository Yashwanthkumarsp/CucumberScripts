package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
features = {"./src/test/resources/Facebook_Features"},
glue = {"StepDefinition"},
monochrome = true
)
public class Facebook_TestRun extends AbstractTestNGCucumberTests {
	
}
