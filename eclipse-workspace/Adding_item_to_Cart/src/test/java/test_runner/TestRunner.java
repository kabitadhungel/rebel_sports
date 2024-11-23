package test_runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/featureFile.feature",
		glue= {"step_definition"},
		plugin= {"pretty",
				"html:target/cucumber.html",
				"json:target/cucumber.json"
				}
		
		)

public class TestRunner {
	
}


