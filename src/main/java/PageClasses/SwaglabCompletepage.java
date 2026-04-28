package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabCompletepage {

    @FindBy(xpath = "//h2[@data-test='complete-header']") private WebElement orderPlaceMsg;

    public SwaglabCompletepage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    public String getOrderPlaceMsg()
    {
        String actMsg = orderPlaceMsg.getText();
        return actMsg;
    }
}
