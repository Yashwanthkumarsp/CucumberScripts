package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./src/test/resources/YouTube_Feature/Search.feature" }, glue = {
		"StepDefinition" }, monochrome = true, plugin = { "pretty", "html:target/SearchReport" })

public class Youtube_TestRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
