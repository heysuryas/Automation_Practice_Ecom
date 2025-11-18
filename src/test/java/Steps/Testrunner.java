package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Steps", "Hooks"},
        tags = "@smoke",     // run tests using tags
        plugin = {
                "pretty",
                "html:target/CucumberReports/report.html",
                "json:target/CucumberReports/report.json",
                "junit:target/CucumberReports/report.xml"
        },
        monochrome = true
)
public class Testrunner extends AbstractTestNGCucumberTests {
}
