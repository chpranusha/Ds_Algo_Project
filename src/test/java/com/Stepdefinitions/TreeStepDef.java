package com.Stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.Pageobjects.Arrays;
import com.Pageobjects.DataStructures;
import com.Pageobjects.Getstarted;
import com.Pageobjects.GraphPage;
import com.Pageobjects.LoginPage;
import com.Pageobjects.TreePage;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDef  extends BaseClass {

	WebDriver driver = Helper.getDriver();

	Getstarted sp = new Getstarted(Helper.getDriver());
	LoginPage lp = new LoginPage(Helper.getDriver());
	DataStructures ds = new DataStructures(Helper.getDriver());
	Arrays ay= new Arrays(Helper.getDriver());
	GraphPage gp= new GraphPage(Helper.getDriver());
	TreePage tp = new TreePage(Helper.getDriver());

	
	@When("user click on Get Started button in tree section")
	public void user_click_on_get_started_button_in_tree_section() {
		tp.clickGetStarted();
	}
	@When("user click on overview of Trees")
	public void user_click_on_overview_of_trees() {
		tp.clickoverviewOfTreeslink();
	}
	
	@When("user enters the Python code in text editor")
	public void user_enters_the_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		List<List<String>>data=pythonCode.cells();
		tp.enterCode(data.get(0).get(0));
	}
	
	@Then("User navigate back to tree page {string}")
	public void user_navigate_back_to_tree_page(String url) {
		Helper.getDriver().get(url);
	}
	
	@When("user click on Terminologies")
	public void user_click_on_terminologies() {
		tp.clickTerminologiesLink();
	}
	
	@When("user click on Types of Trees")
	public void user_click_on_types_of_trees() {
		tp.clickTypesOfTreesLink();
	}
	
	@When("user click on Tree Traversals")
	public void user_click_on_tree_traversals() {
		tp.clickTreeTraversalsLink();
	}
	
	@When("user click on Traversals-Illustration")
	public void user_click_on_traversals_illustration() {
		tp.clickTraversalsIllustrationLink();
	}
	
	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
		tp.clickBinaryTreesLink();
	}
	
	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
		tp.clickTypesOfBinaryTreesLink();
	}
	
	@When("user click on Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
		tp.clickBinaryTreeTraversalsLink();
	}
	
	@When("user click on Implementation in Python")
	public void user_click_on_implementation_in_python() {
		tp.clickImplementationInPythonLink();
	}
	
	@When("user click on Applications of Binary trees")
	public void user_click_on_applications_of_binary_trees() {
		tp.clickApplicationsOfBinaryTreesLink();
	}
	
	@When("user click on Implementation of Binary Trees")
	public void user_click_on_implementation_of_binary_trees() {
		tp.clickImplementationOfBinaryTreesLink();
	}
	
	@When("user click on Binary Search Trees")
	public void user_click_on_binary_search_trees() {
		tp.clickBinarySearchTreesLink();
	}
	
	@When("user click onImplementation Of BST")
	public void user_click_on_implementation_of_bst() {
		tp.clickImplementationOfBSTLink();
	}
	
	
}
