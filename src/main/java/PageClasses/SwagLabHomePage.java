package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom/regular class 2
public class SwagLabHomePage {// class name always end with page

@FindBy(xpath = "//div[@class='app_logo']") private WebElement LogoText;// private WebElement logoText = driver.findElement(By.xpath(""))
@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement BackPack_AddtoCart;
 @FindBy(xpath = "//a[@data-test='shopping-cart-link']") private  WebElement cart;
 @FindBy(xpath = "//button[text()='Remove']") private  WebElement removebtn;
 @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikelight;
 @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacket;
 @FindBy(xpath = "//button[text()='Open Menu']") private WebElement mainMenu;
 @FindBy(xpath = "//a[text()='Logout']") private WebElement logOut;


     public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver ,this);
    }

    public String getLogoText()
    {
        return LogoText.getText();
    }
    public void clickOnSauceAddtoCart()
    {
        BackPack_AddtoCart.click();
    }
    public void clickoncart()
    {
        cart.click();
    }

    public String removeBtn()
    {
        String text = removebtn.getText();
        return text;
    }

    public void clickOnBikelight()
    {
        bikelight.click();
    }
    public void clickOnjacket()
    {
        jacket.click();
    }

    public void clickMenu()
    {
        mainMenu.click();
    }

    public void clickLogout()
    {
        logOut.click();
    }






}
