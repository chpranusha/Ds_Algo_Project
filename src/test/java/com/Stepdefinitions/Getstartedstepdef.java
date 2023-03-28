package com.Stepdefinitions;

import io.cucumber.java.en.*;

import com.Pageobjects.Getstarted;
import com.Utils.BaseClass;
import com.Utils.Helper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Getstartedstepdef extends BaseClass{
	
	WebDriver driver = Helper.getDriver();
	Getstarted sp = new Getstarted(Helper.getDriver());

	@Given("User launch Browser and enters url {string}")
	public void user_launch_browser_and_enters_url(String url) throws InterruptedException {
		Helper.openPage(url);
	}

	@When("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() throws Exception {
		 sp.clickGetStartedBtn();
	}

	@Then("The user  should be successfully redirected to home page")
	public void the_user_should_be_successfully_redirected_to_home_page() throws Exception {
		String actualText = sp.validateHomePage();
		   Assert.assertEquals(actualText, "NumpyNinja");
	}

	@Then("The user clicks on data structure dropdown")
	public void the_user_clicks_on_data_structure_dropdown() throws Exception {
		sp.dropDownSelect();
		
	}

	@When("The user select any dropdown menu {string}")
	public void the_user_select_any_dropdown_menu(String string) throws InterruptedException {
		sp.dropDownClick();
	   
	}

	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) throws InterruptedException {
		Getstarted sp = new Getstarted(Helper.getDriver());
		String actualText = sp.alertMessage();
		   Assert.assertEquals(actualText, "You are not logged in");
	}

	@When("The user click any of the Get started button in home page")
	public void the_user_click_any_of_the_get_started_button_in_home_page() throws InterruptedException {
		sp.getStartedClick();
		}
	

}





