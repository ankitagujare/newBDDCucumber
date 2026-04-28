package PageClasses;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutpage {

    @FindBy(xpath = "//input[@id='first-name']") private WebElement FN;
    @FindBy(xpath = "//input[@id='last-name']") private WebElement LN;
    @FindBy(xpath = "//input[@id='postal-code']") private WebElement ZC;
    @FindBy(xpath = "//input[@id='continue']") private WebElement Continue;



    public SwagLabCheckoutpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this); //className.methodName(webDriverObject, thisKeyword)
    }

    public void FN(String Fname)
    {
        FN.sendKeys(Fname);
    }
    public void LN(String Lname)
    {
        LN.sendKeys(Lname);
    }
    public void ZC(String code)
    {
        ZC.sendKeys(code);
    }
    public void Continue()
    {
        Continue.click();
    }








}
