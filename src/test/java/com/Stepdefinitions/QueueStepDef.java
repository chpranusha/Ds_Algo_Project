package com.Stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.Pageobjects.QueuePage;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.When;

public class QueueStepDef extends BaseClass {
	
	WebDriver driver = Helper.getDriver();
	@When("user click on Get Started button on Queue")
	public void user_click_on_get_started_button_on_queue() {
	    qp=new QueuePage(driver);
	    qp.clickOnGetStartedGraph();
	}

	@When("user click on Implementation of Queue in Python")
	public void user_click_on_implementation_of_queue_in_python() {
		 qp=new QueuePage(driver);
	    qp.clickOnImplementationOfQueue();
	}
	@When("user click on Implementation using collections.deque")
	public void user_click_on_implementation_using_collections_deque() {
		 qp=new QueuePage(driver);
	   qp.clickOnImplentationCollection();
	}

	@When("user click on Implementation using array")
	public void user_click_on_implementation_using_array() {
		 qp=new QueuePage(driver);
	    qp.clickOnImplementationArray();
	}

	@When("user click on Queue Operations")
	public void user_click_on_queue_operations() {
		 qp=new QueuePage(driver);
	    qp.clickOnQueueOperations();
	}


}
