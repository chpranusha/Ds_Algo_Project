package com.Stepdefinitions;

import org.testng.Assert;

import com.Pageobjects.RegisterPage;
import com.Pageobjects.Getstarted;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseClass {
	
	RegisterPage rp = new RegisterPage(Helper.getDriver());
	Getstarted sp = new Getstarted(Helper.getDriver());

	@Given("user opens browser and launch the url {string}")
	public void user_opens_browser_and_launch_the_url(String url) throws InterruptedException {
	    Helper.openPage(url);	    
	}
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String getStartedText) throws Exception {
		sp.clickGetStartedBtn();
	}
	@When("clicks on register link")
	public void clicks_on_register_link() throws Exception {
		rp.clickRegisterLink();
	}
	@Then("user should successfully able to see register page title {string}")
	public void user_should_successfully_able_to_see_register_page_title(String registrationText) {
		Assert.assertEquals(Helper.getTitle(), registrationText);
	}
	@When("user enter the {string}, {string}, {string}")
	public void user_enter_the(String username, String password1, String password2) throws Exception {
		rp.sendUsernameText(username);
		rp.sendPasswordText1(password1);
		rp.sendPasswordText2(password2);
	}
	@When("user click on register button")
	public void user_click_on_register_button() throws Exception {
		rp.clickRegisterButton();
	}
	@Then("user should be successfully able to see the label as {string}")
	public void user_should_be_successfully_able_to_see_the_label_as(String text) {
		Assert.assertEquals(rp.getNewAccountCreatedLabelText().contains(text), true);
		
	}
	@Then("user click on Sign Out")
	public void user_click_on_sign_out() throws Exception {
		rp.clickSignOutLink();
	}
	
	//Scenario: Register validation with invalid inputs
	@When("user click register link without entering anything")
	public void user_click_register_link_without_entering_anything() throws Exception {
		rp.clickRegisterButton();
	}
	@Then("user should get fillout field error message {string} below username field.")
	public void user_should_get_fillout_field_error_message_below_password_field(String errorMsg) throws InterruptedException {
		Assert.assertEquals(rp.validationEmptyFields(), errorMsg);
		
	}

	//  Scenario Outline: Register validation with invalid inputs/blank fields

	@When("user enters {string} with username and click on register button")
	public void user_enters_with_username_and_click_on_register_button(String userName) throws Exception {
		rp.sendUsernameText(userName);
	    rp.clickRegisterButton();
	}
	@Then("user should get fillout field error message {string}")
	public void user_should_get_fillout_field_error_message(String errorMsg) throws InterruptedException {
		Assert.assertEquals(rp.validationEmptyFieldspassword1(), errorMsg);
  
	}
	
	@When("user enters {string} {string}  with username and password fields  and click on register button")
	public void user_enters_with_username_and_password_fields_and_click_on_register_button(String userName, String password) throws Exception {
		rp.sendUsernameText(userName);
	    rp.sendPasswordText1(password);
	    rp.clickRegisterButton();
	}
	@Then("user should get error message password confirmation {string}")
	public void user_should_get_error_message_password_confirmation(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validationEmptyFieldspassword2(), errorMsg); 
	}
	
	@When("user enters  {string} {string} with password,password confirmation fields blank inputs and click on register button")
	public void user_enters_with_password_password_confirmation_fields_blank_inputs_and_click_on_register_button(String password, String password2) throws Exception {
		rp.sendPasswordText1(password);
	    rp.sendPasswordText2(password2);
	    rp.clickRegisterButton();
	}
	@Then("user should get error message user name {string}")
	public void user_should_get_error_message_user_name(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validationEmptyFields(), errorMsg);
	}
	
	@When("user enters  {string}  with password field  and click on register button")
	public void user_enters_with_password_field_and_click_on_register_button(String password) throws Exception {
		rp.sendPasswordText1(password);
	    rp.clickRegisterButton();

	}
	@Then("user should get error message under user name  {string}")
	public void user_should_get_error_message_under_user_name(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validationEmptyFields(), errorMsg); 
	}
	@When("user enters {string} with passwordconfirmation and click on register button")
	public void user_enters_with_passwordconfirmation_and_click_on_register_button(String password2) throws Exception {
		rp.sendPasswordText2(password2);
	    rp.clickRegisterButton();
	}
	@Then("user will get error message username {string}")
	public void user_will_get_error_message_username(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validationEmptyFields(), errorMsg);
	}
	@When("user enters {string} {string} {string} with mismatching passwords")
	public void user_enters_with_mismatching_passwords(String userName, String password, String password2) throws Exception {
		rp.validatePasswordMismatchInputs(password, password2);
	    rp.sendUsernameText(userName);
	    rp.sendPasswordText1(password);
	    rp.sendPasswordText2(password2);
	    rp.clickRegisterButton();
	}
	@Then("user should get a password mismatch error message {string}")
	public void user_should_get_a_password_mismatch_error_message(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validationPwdMismatch(), errorMsg);
	}
	
	@When("user enters {string} {string} {string} password less than eight characters")
	public void user_enters_password_less_than_eight_characters(String userName, String password, String password2) throws Exception {
		rp.validateLessThanEightChars(password, password2);
		rp.sendUsernameText(userName);
		rp.sendPasswordText1(password);
	    rp.sendPasswordText2(password2);
	    rp.clickRegisterButton();
	}
	@Then("user should get password atleast eight char error message {string}")
	public void user_should_get_password_atleast_eight_char_error_message(String errorMsg ) throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(rp.validatepwd(), errorMsg);
	}


	@When("user enters {string} {string} {string} password with all numeric input")
	public void user_enters_password_with_all_numeric_input(String userName, String password, String password2)  throws Exception {
		rp.validateNumericInputs(password,password2);
		rp.sendUsernameText(userName);
		rp.sendPasswordText1(password);
		rp.sendPasswordText2(password2);
		rp.clickRegisterButton();
	}
	@Then("user should get enter valid input error message {string}")
	public void user_should_get_enter_valid_input_error_message(String errorMsg)  throws Exception {
		Assert.assertEquals(rp.validatenumeric(), errorMsg);
	}
	@When("user enters the {string} {string} {string} all similar to one another")
	public void user_enters_the_all_similar_to_one_another(String userName, String password, String password2) throws Exception {
		rp.validateCompareUnPwd(userName, password, password2);
		rp.sendUsernameText(userName);
		rp.sendPasswordText1(password);
		rp.sendPasswordText2(password2);
		rp.clickRegisterButton();
	}
	@Then("user should get password not similar to username error message {string}")
	public void user_should_get_password_not_similar_to_username_error_message(String errorMsg) throws Exception {
		Assert.assertEquals(rp.validatecompare(), errorMsg);
	}
}