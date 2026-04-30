package LibraryFiles;

import io.cucumber.java.bs.A;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{
    //this method is use to get test data from property file
    //need to provide input as a key
    //sAuthor Name :@Ankita
    public static String getPFData(String key) throws IOException {


        // 1.here to jump property file-we provide the path of our file (project location path+ property file path)
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\Property.properties");


        //2.to open property file -to read data we use class properties object create below mention
        Properties ProObj = new Properties();
        
        //open property files
        ProObj.load(file);

        //3. now we have key to get the value for that key we call method and pass key
        String value = ProObj.getProperty(key);
        return value;

    }

    // for select options

    public static void selectOptionByText(WebElement element, String text)
    {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    public static void selectOptionByValue(WebElement element, String value)
    {
        Select s = new Select(element);
        s.selectByVisibleText(value);
    }
    public static void selectOptionByIndex(WebElement element, int index)
    {
        Select s = new Select(element);
        s.selectByIndex(index);
    }

    // for capture screenshot

    // create SS folder -project-new -Directory-Screenshots

    public static void captureSS(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // provide the path of screenshot folder for destination

        File dest = new File("C:\\Data\\software testing training\\FirstJavaProject\\newBDDCucumber\\Screenshots");
        FileHandler.copy(src,dest);
    }

    public static void mouseActions_DragAndDrop(WebDriver driver,WebElement src,WebElement dest)
    {
        Actions act = new Actions(driver);
        act.dragAndDrop(src,dest).perform();
    }
















}
