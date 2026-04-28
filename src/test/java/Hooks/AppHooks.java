package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class AppHooks {
    @Before
    public void openBrowser() throws IOException {
        System.out.println("--Open browser --");
        String browser = UtilityClass.getPFData("browserName");//get browser name from propert file
        DriverFactory.initializeBrowser(browser); // pass browser Name to initializeBrowser () method
    }
    @After
    public void closeBrowser()
    {
        System.out.println("-close browser--");
        DriverFactory.driver.quit();
    }
}
