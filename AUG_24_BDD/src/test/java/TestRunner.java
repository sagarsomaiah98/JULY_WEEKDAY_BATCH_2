import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				



@CucumberOptions(plugin = { "html:target/cucumber-html-report",
       },
features={"D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\AUG_24_BDD\\features\\login.feature" },
glue={"StepDefinition"})
public class TestRunner {
	


	
	
 

	

}
