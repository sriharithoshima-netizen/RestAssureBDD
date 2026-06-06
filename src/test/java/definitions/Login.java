package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Login {
    @Given("User opens the application")
    public void
    user_open_the_application() {
        System.out.println("Application Opened");
    }
    @When("User enters username as {string}")
    public void
    user_enters_username(String username) {
        System.out.println("Username");
    }
    @When("User enters password as {string}")
    public void
    user_enters_password(String password){
        System.out.println("Password");
    }
    @Then("User clicks Ok button")
        public void user_Click_ok_button(){
            System.out.println("User clicks Ok button");
        }
        @Then("User should be navigated to the application home page")
         public void user_should_be_navigated_to_home_page(){
            System.out.println("Home Page Displayed");
        }
    }
