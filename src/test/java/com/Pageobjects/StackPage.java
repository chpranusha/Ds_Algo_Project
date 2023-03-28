package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.Utils;
import org.openqa.selenium.WebElement;


public class StackPage {
	
	public StackPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	@FindBy  (xpath="//a[@href = 'stack']")
	WebElement GetstartStack;
	
	@FindBy (xpath="//a[text()='Operations in Stack']") 
	WebElement OperationsinStack;
	
	@FindBy  (xpath="//a[text()='Implementation']") 
	WebElement Implementation;
	
	@FindBy  (xpath="//a[text()='Applications']") 
	WebElement Applications;
	
	@FindBy (xpath="//a[text() = 'Practice Questions']") 
	WebElement PracticeQuestions;
	
	public void clickOnGetStartedStack() {
		GetstartStack.click();
	}
	public void clickOnOperationsInStack() {
		OperationsinStack.click();
	}
	public void clickOnImplementation() {
		Implementation.click();
	}
	public void clickOnApplications() {
		Applications.click();
	}
	public void clickonPracticeQuestions() {
		PracticeQuestions.click();
	}

}