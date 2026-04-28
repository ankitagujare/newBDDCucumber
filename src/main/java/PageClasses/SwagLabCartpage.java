package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabCartpage {

    @FindBy (xpath = "//div[text()='29.99']")private WebElement pricetext;
    @FindBy (xpath = "//button[@id='checkout']")private WebElement checkout;
    @FindBy(xpath = "(//div[text()='9.99'])[1]") private WebElement BikePrice;
    @FindBy(xpath = "//div[@class='cart_item_label']") private List<WebElement> carttotal;

    public SwagLabCartpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this); //className.methodName(webDriverObject, thisKeyword)
    }

    public double BPgetText()
    {
        String Price = pricetext.getText();
        Price=Price.substring(1);
        double actPrice = Double.parseDouble(Price);
        return actPrice;

    }

    public void clickOncheckout()
    {
        checkout.click();
    }
    
    public Double getbikeprice()
    {
        String bprice = BikePrice.getText();
        bprice= bprice.substring(1);
        double actpr=Double.parseDouble(bprice);
        return actpr;
    }

    public int getcartcount()
    {
        int totalc = carttotal.size();
        return totalc;
    }

}
