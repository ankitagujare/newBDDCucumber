package WorkSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitFormSteps {
    @Given("user in at signup page")
    public void user_in_at_signup_page() {
        System.out.println("at signup page");
    }

    @When("user enter {string} inside form")
    public void user_enter_inside_form(String name) {
        System.out.println("Entered Name -"+name);
    }

    @When("user enter age as {int}")
    public void user_enter_age_as(Integer age) {
        System.out.println("Entered age -"+age);
    }

    @When("user confirm gender as {string}")
    public void user_confirm_gender_as(String gender) {
        System.out.println("Entered gender-"+gender);
    }

    @Then("user gets created")
    public void user_gets_created() {
        System.out.println("user created");
    }
}
