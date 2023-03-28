package com.Stepdefinitions;


import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Pageobjects.Arrays;
import com.Pageobjects.DataStructures;
import com.Pageobjects.Getstarted;
import com.Pageobjects.LoginPage;
import com.Pageobjects.StackPage;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.ConfigReader;
import com.Utils.Loggerload;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StackStepDef extends BaseClass {
	

	WebDriver driver = Helper.getDriver();
	Arrays ay= new Arrays(Helper.getDriver());
	DataStructures ds = new DataStructures(Helper.getDriver());
	
	@When("user click on Get Started button on Stack")
	public void user_click_on_get_started_button_on_stack() {
	    Stp=new StackPage(driver);
	    Stp.clickOnGetStartedStack();
	}

	@When("user click on Operations in Stack")
	public void user_click_on_operations_in_stack() {
	    Stp.clickOnOperationsInStack();
	    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	}

	@When("user click on Implementation")
	public void user_click_on_implementation() {
		Stp=new StackPage(driver);
	   Stp.clickOnImplementation();
	}

	@When("user click on Applications")
	public void user_click_on_applications() throws InterruptedException {
	    Thread.sleep(1000);
	    Stp=new StackPage(driver);
		Stp.clickOnApplications();
	}

}