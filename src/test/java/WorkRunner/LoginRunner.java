package WorkRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Data\\software testing training\\FirstJavaProject\\newBDDCucumber\\src\\test\\java\\WorkFeatures\\Assignment3.feature",
        glue = {"WorkSteps","Hooks"},
        // tags = "@Performance or @Smoke",
        publish = true
         // dryRun=true
        //plugin = {"pretty","html:target/cucumber-reports/SampleReport.html"}  for report generate
        //plugin = {"pretty","html:Reports/cucumber-reports/SampleReport.html"},
        //plugin={"rerun:target/FailedScenariosFiles/failed.txt"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
