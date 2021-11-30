package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features/PhpTravels.feature",
		glue= {"StepDefinitions"},
		monochrome=true,
		plugin= {"pretty","html:target/MyReports/report.html","json:target/MyReports/report.json"}
		
		)
		
public class PhpTravels_runner  {
	
}
