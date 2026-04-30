package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverviewpage {

    @FindBy(xpath = "//div[text()='Free Pony Express Delivery!']") private WebElement shippingInfo;
    @FindBy(xpath = "//div[@data-test='total-label']") private WebElement PriceTotal;
    @FindBy(xpath = "//button[text()='Finish']") private WebElement Finish;

    WebDriver driver;    //global variable



    public SwagLabCheckoutOverviewpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this); //className.methodName(webDriverObject, thisKeyword)
        this.driver=driver;    //global=local  -> assign local variable info into global variable
    }

    public String shipdd()
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
