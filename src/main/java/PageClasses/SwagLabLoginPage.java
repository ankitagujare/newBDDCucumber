package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

    //step1: variable declaration

    @FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
    @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;
    @FindBy(xpath = "//h3[@data-test='error']") private WebElement errorMsg;


    //step 2 :initialization
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this); //className.methodName(webDriverObject, thisKeyword)
    }

    //step3 :perform Action

    public void enterUN(String username)
    {
        UN.sendKeys(username);
    }

    public void enterPWD(String password)
    {
        PWD.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        LoginBtn.click();
    }

    public String getErrorMsg()
    {
        String errorMsgText = errorMsg.getText();
        return errorMsgText;
    }



}
