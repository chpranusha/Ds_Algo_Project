package com.Stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Pageobjects.DataStructures;
import com.Pageobjects.Getstarted;
import com.Pageobjects.LoginPage;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.ConfigReader;

import io.cucumber.java.en.*;

public class DataStructureStepDef extends BaseClass {

	WebDriver driver = Helper.getDriver();
	Getstarted sp = new Getstarted(Helper.getDriver());
	LoginPage lp = new LoginPage(Helper.getDriver());
	DataStructures ds = new DataStructures(Helper.getDriver());

//user has to login before testing data structures
		@Given("user open browser and launch the url {string}")
		public void user_open_browser_and_launch_the_url(String url) throws Exception {
			Helper.openPage(url);   
		    	}

		@When("user click  {string} button")
		public void user_click_button(String getStartedText) throws Exception {
			sp.clickGetStartedBtn();
		}

		@When("click on signin link")
		public void click_on_link ()throws Exception {
		   lp.signInClick();
		}

		@When("user enters  {string} {string}")
		public void user_enters(String username, String password) throws Exception {
			lp.enterUserName(username);
			lp.enterPassword(password);

		}

		@When("user click on login button")
		public void user_click_on_login_button() throws Exception {
		    lp.clickLogInBtn();
		}
	
	
	//Data structures scenarios
	@Given("The user is at home page with title {string}")
	public void the_user_is_at_home_page_with_title(String title) throws Exception {
		  Assert.assertEquals(title, Helper.getDriver().getTitle());

	}

	@When("user click on Get started button in Data Structure")
	public void user_click_on_get_started_button_in_data_structure() throws Exception {
		ds.clickGetStartedDs();

	}

	@Then("user will successfully navigate to corresponding page with title {string}")
	public void user_will_successfully_navigate_to_corresponding_page_with_title(String title) {
		 Assert.assertEquals(title, Helper.getDriver().getTitle());

	}

	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() throws Exception {
		ds.clickTimeComplexityLink();

	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
		 Assert.assertEquals(title, Helper.getDriver().getTitle());

	}

	@When("user clicks on Try here")
	public void user_clicks_on_try_here() throws Exception {
		ds.clickTryHereLink();

	}

	@When("user enter the python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws Exception {
		ds=new DataStructures(Helper.getDriver());
		 List<List<String>>data=pythonCode.cells();
		   ds.enterCode(data.get(0).get(0)); 
	}

	@When("click on run button")
	public void click_on_run_button() throws Exception {
		ds.clickRunBtn();
	}

	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String homepage) {
		   Helper.getDriver().get(homepage);
	}
	
}
