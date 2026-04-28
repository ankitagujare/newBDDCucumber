package WorkSteps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import PageClasses.*;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabLoginSteps {

    SwagLabLoginPage login = new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage  home = new SwagLabHomePage(DriverFactory.driver);
    SwagLabCartpage cartpage= new SwagLabCartpage(DriverFactory.driver);
    SwagLabCheckoutpage checkoutpage= new SwagLabCheckoutpage(DriverFactory.driver);
    SwagLabCheckoutOverviewpage overviewpage = new SwagLabCheckoutOverviewpage(DriverFactory.driver);
    SwaglabCompletepage complete = new SwaglabCompletepage(DriverFactory.driver);
    @When("wait for {int} seconds")
    public void wait_for_seconds(Integer timeinsec) throws InterruptedException {
        Thread.sleep(timeinsec*1000);

    }

    @Given("user is on Swag lab login")
    public void user_is_on_Swag_lab_login() throws IOException {

        String urlValue = UtilityClass.getPFData("URL");
        DriverFactory.driver.get(urlValue);
    }

    @When("user enter username on swaglab login page {string}")
    public void user_enter_username_on_swaglab_login_page(String username)
    {
        login.enterUN(username);

    }

    @When("user enter password on swaglab login page {string}")
    public void user_enter_password_on_swaglab_login_page(String password)
    {
        login.enterPWD(password);

    }

    @When("user click on login btn on swaglab login page")
    public void user_click_on_login_btn_on_swaglab_login_page()
    {
        login.clickLoginBtn();
    }


    @Then("home page visible with logo text {string}")
    public void home_page_visible_with_logo_text(String expLogoText)
    {
        String actLogoText = home.getLogoText();

        Assert.assertEquals(actLogoText,expLogoText,"Failed Act & Exp Logo Text are different");

    }
    @Then("login failed error message should be visible with message {string}")
    public void login_failed_error_message_should_be_visible_with_message(String expErrorMsg)
    {
        String actErrorMsg = login.getErrorMsg();
        Assert.assertEquals(actErrorMsg,expErrorMsg,"act & exp error msg ");
    }

    @When("user click on Add to card for Backpack product")
    public void user_click_on_add_to_card_for_backpack_product() {
       home.clickOnSauceAddtoCart();
    }

    @Then("Remove button is visible as {string}")
    public void remove_button_is_visible_as(String expBtn) {
        String actbtn = home.removeBtn();

        Assert.assertEquals(actbtn,expBtn,"remove button not visible here");
    }

    @When("user click on cart button")
    public void user_click_on_cart_button() {
        home.clickoncart();
    }


    @Then("user can see Backpack price should {double}")
    public void user_can_see_backpack_price_should(Double expBPprice) {
        double actBPprice = cartpage.BPgetText();
        Assert.assertEquals(expBPprice,actBPprice,"fail-product price");
    }

    @Then("use click on checkout button")
    public void use_click_on_checkout_button() {
        cartpage.clickOncheckout();
    }
    @When("user enter firstname as {string}")
    public void user_enter_firstname_as(String name) {
        checkoutpage.FN(name);
    }

    @When("user enter lastname as {string}")
    public void user_enter_lastname_as(String lname) {
          checkoutpage.LN(lname);
    }

    @When("user enter zipcode as {string}")
    public void user_enter_zipcode_as(String zcode) {
         checkoutpage.ZC(zcode);
    }

    @When("user click on continue button")
    public void user_click_on_continue_button() {
         checkoutpage.Continue();
    }


    @When("user validate Shipping Information with message {string}")
    public void user_validate_shipping_information_with_message(String expm) {
        String actshims = overviewpage.shipadd();
        Assert.assertEquals(actshims,expm);
    }

    @When("user validate price total")
    public void user_validate_price_total() {
        String pri = overviewpage.pricetotal();
        System.out.println(pri);

    }

    @When("user click on Finish button")
    public void user_click_on_finish_button() {
        overviewpage.fifnisbtn();

    }

    @Then("order success message should be visible with messgae {string}")
    public void order_success_message_should_be_visible_with_messgae(String expMsg) {
        String actMsg = complete.getOrderPlaceMsg();

        Assert.assertEquals(actMsg,expMsg,"msg miss match");

    }
    @When("user click on Add to card for Sauce Labs Bike Light")
    public void user_click_on_add_to_card_for_sauce_labs_bike_light() {
        home.clickOnBikelight();
    }


    @And("user can see Sauce Labs Bike Light price {double}")
    public void userCanSeeSauceLabsBikeLightPrice(Double explightprice) {
        double act1 = cartpage.getbikeprice();
        Assert.assertEquals(act1,explightprice,"price is not 9.99");
    }

    @When("user click on Add to card for Sauce Labs Bolt T-Shirt")
    public void user_click_on_add_to_card_for_sauce_labs_bolt_t_shirt() {
      home.clickOnjacket();
    }

    @Then("user can see {int} product on cart")
    public void user_can_see_product_on_cart(Integer expcount) {
        int actcount = cartpage.getcartcount();
        Assert.assertEquals(actcount,expcount,"count is not 3 in cart ");
    }
    @When("user click on main menu")
    public void user_click_on_main_menu() {
       home.clickMenu();
    }

    @Then("user click on Logout")
    public void user_click_on_logout() {
        home.clickLogout();
    }
}
