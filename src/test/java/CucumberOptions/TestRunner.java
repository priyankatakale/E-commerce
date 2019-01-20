package CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="StepDefinations",
		tags = {"@runThis", "not @Ignore"},
		format={"json:target/Destination/cucumber.json"})

public class TestRunner {

}