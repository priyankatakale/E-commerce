package CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/HomePage.feature",
		glue="StepDefinations",
		format= {"pretty","html:test-output"},
		tags = {"@runThis"},
		dryRun=true, // check the mapping is proper bet feature file and step defination
		monochrome=true,// display console output in readable format
		strict=true //it will check if any step in not defined in step defination file
		)

public class TestRunner {

}