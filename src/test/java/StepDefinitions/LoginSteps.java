package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("User enters <username> and <password>")
	public void User_enters_username_and_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User enters username and password");
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("Click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The applicaiton is opened")
	public void the_applicaiton_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	
}
