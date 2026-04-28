package WorkRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Data\\software testing training\\FirstJavaProject\\newBDDCucumber\\src\\test\\java\\WorkFeatures\\Assignment4.feature",
        glue = {"WorkSteps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SampleReportSwagLabe2e.html"}
)
public class SwagLabRunner extends AbstractTestNGCucumberTests
{

}
