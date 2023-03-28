package com.Stepdefinitions;


import org.openqa.selenium.WebDriver;

import com.Pageobjects.Arrays;
import com.Pageobjects.GraphPage;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GraphStepDef extends BaseClass {
WebDriver driver = Helper.getDriver();
	
	@When("user click on Graph Representations")
	public void user_click_on_graph_representations() {
		gp= new GraphPage(Helper.getDriver());
		gp.clickOnGraphRepresentation();
	}
	
	@When("user click on Get Started button on Graph")
	public void user_click_on_get_started_button_on_graph() {
		gp= new GraphPage(Helper.getDriver());
		gp.clickGetStartedOnGraph();
	}
	
	@When("user click on Graph")
	public void user_click_on_graph() {
	    gp.clickOnGraph();
	}
	
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
		gp = new GraphPage(driver);
		gp.dropDownGraphClick();
	}
	
	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
		ay = new Arrays(driver);
	    ay.navigateTo("graphrepresentationsurl");
	}
	
	@When("the user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		gp = new GraphPage(driver);
	    gp.clickOnGraphPracQuesLink();
	}
	
	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		String Title = driver.getTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title not matched");
	}

	private void assertEquals(String title, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	
}
