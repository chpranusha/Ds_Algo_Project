package com.Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QueuePage {
	
	public QueuePage (WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	
	
	@FindBy (xpath="//a[@href = 'queue']")
    WebElement getStartQueue;
	
	@FindBy (xpath="//a[text()='Implementation of Queue in Python']")
	WebElement implementationOfQueue;
	
	@FindBy (xpath="//a[text()='Implementation using collections.deque']")
	WebElement implentationCollections;
	
	@FindBy (xpath="//a[text()='Implementation using array']")
    WebElement implementationArrays;
	
	@FindBy (xpath="//a[text()='Queue Operations']")
	WebElement queueOperations;
	
	
	public void clickOnGetStartedGraph() {
		getStartQueue.click();
	}
	public void clickOnImplementationOfQueue() {
		implementationOfQueue.click();
	}
	public void clickOnImplentationCollection() {
		implentationCollections.click();
	}
	public void clickOnImplementationArray() {
		implementationArrays.click();
	}
	public void clickOnQueueOperations() {
		queueOperations.click();
	}
}
