package stepdefinitions;

import com.qa.factory.DriverFactory;

import PageObjectModel.GetStarted;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartedSteps {
	
	private GetStarted getstarted =new GetStarted(DriverFactory.getDriver());
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}
	
	@When("User clicks on GetStarted button")
	public void user_clicks_on_get_started_button() {
		
		getstarted.ClickOnGetStarted();
	    
	}
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		 getstarted.HomepageTitle();
	}
	@When("The user clicks Data Structures drop down")
	public void the_user_clicks_drop_down() {
		getstarted.ClickOnDropdown();
	}
	@And("The user select one of the dropdown menu")
	public void the_user_select_one_of_the_dropdown_menu() throws InterruptedException {
				Thread.sleep(1000);
				getstarted.selectDropdown();
			
			}
	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
	  getstarted.AlertMsg();
	}

	
	@When("The user clicks any of the Get started button in home page")
	public void The_user_clicks_any_of_the_Get_started_button_in_home_page () {
		getstarted.home_getstarted();
		
	}
	

	@When("The user clicks Sign in")
	public void The_user_clicks_Sign_in () {
		getstarted.SigninLink();
		}
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    
	}
	@When ("The user clicks Register")
	public void The_user_clicks_Register() {
		getstarted.RegisterLink();
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	    
		
	}
	
}
