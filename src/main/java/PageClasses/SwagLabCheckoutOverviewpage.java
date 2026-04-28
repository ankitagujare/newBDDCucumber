package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverviewpage {

    @FindBy(xpath = "//div[text()='Free Pony Express Delivery!']") private WebElement shippingInfo;
    @FindBy(xpath = "//div[@data-test='total-label']") private WebElement PriceTotal;
    @FindBy(xpath = "//button[text()='Finish']") private WebElement Finish;



    public SwagLabCheckoutOverviewpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this); //className.methodName(webDriverObject, thisKeyword)
    }

    public String shipadd()
    {
        String sI = shippingInfo.getText();
        return sI;
    }

    public String pricetotal()
    {
        String tP = PriceTotal.getText();
       return tP;
    }

    public void fifnisbtn()
    {
        Finish.click();
    }

}
