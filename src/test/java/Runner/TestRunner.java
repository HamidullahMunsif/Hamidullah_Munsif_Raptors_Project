package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features", //Location for Feature Files
        glue = "PagesSteps", //Location for Packages contains steps for cucumber to scan
        //tags = "@ACCOUNTS", //with tags in TestRunner we can run Feature or Scenario in group
        dryRun = false, //if set to TRUE scan for unimplemented steps without executing all the steps.
        plugin = {
                "html:target/cucumber_report/report.html",
                "json:target/jsonReports/report.json"
        }
)
public class TestRunner {

}
