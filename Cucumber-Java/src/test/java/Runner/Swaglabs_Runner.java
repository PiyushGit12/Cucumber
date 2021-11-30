package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features/Swag_Labs.feature",
		glue= {"StepDefinitions"},
		monochrome=true,                     // display the console output in a proper readable format
		dryRun=false,                       // Check the mapping between feature file and Stepdefinitions files
		plugin= {"pretty","html:target/MyReports/report.html",
				"junit:target/MyReports/report.xml",
				"json:target/MyReports/report.json"}
		
		

		)
public class Swaglabs_Runner {

}
