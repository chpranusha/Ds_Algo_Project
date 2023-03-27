package com.Stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Pageobjects.Arrays;
import com.Pageobjects.DataStructures;
import com.Pageobjects.Getstarted;
import com.Pageobjects.LinkedListPage;
import com.Pageobjects.LoginPage;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDef extends BaseClass {

	WebDriver driver = Helper.getDriver();
	static String expectedMsg;
	Getstarted sp = new Getstarted(Helper.getDriver());
	LoginPage lp = new LoginPage(Helper.getDriver());
	DataStructures ds = new DataStructures(Helper.getDriver());
	Arrays ay= new Arrays(Helper.getDriver());
	LinkedListPage ll = new LinkedListPage(Helper.getDriver());
	@When("user click on Get Started button in Linkedlist section")
	public void user_click_on_get_started_button_in_linkedlist_section()
	{
		ll = new LinkedListPage(Helper.getDriver());	
		ll.clickGetStarted();
	}

	@Then("user should navigate to corresponding page with title {string}")
	public void user_should_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());
	}

	@When("user click on Introduction")
	public void user_click_on_introduction() {
		ll.clickIntroductionLink();
	}

	@When("user enters the Python code")
	public void user_enters_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		ll=new LinkedListPage(Helper.getDriver());
		 List<List<String>>data=pythonCode.cells();
		 ll.enterCode(data.get(0).get(0));
	}
	
	@Then("User navigate back to page with title {string}")
	public void user_navigate_back_to_page_with_title(String url) {
		Helper.getDriver().get(url);
	}

	@When("user click on Creating Linked List")
	public void user_click_on_creating_linked_list() {
		ll = new LinkedListPage(Helper.getDriver());
	    ll.clickCreatingLinkedListLink();
	}
	
	@Then("user will navigate to corresponding page with title {string}")
	public void user_will_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());

	}
	
	@When("user click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
		ll = new LinkedListPage(Helper.getDriver());
	    ll.clickTypesOfLinkedListLink();
	}
	
	@When("user click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
		ll = new LinkedListPage(Helper.getDriver());
	    ll.clickImplementLLInPythonLink();
	}
	
	@When("user click on Traversal link")
	public void user_click_on_traversal_link() {
		ll = new LinkedListPage(Helper.getDriver());
		ll.clickTraversalLink();
	}
		
	@When("user click on Insertion link")
	public void user_click_on_insertion_link() {
		ll = new LinkedListPage(Helper.getDriver());
		ll.clickInsertionLink();
	}
		
	@When("user click on Deletion link")
	public void user_click_on_deletion_link() {
		ll = new LinkedListPage(Helper.getDriver());
		ll.clickDeletionLink();
	}
	
}
