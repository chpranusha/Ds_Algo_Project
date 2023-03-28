package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.Utils;

public class GraphPage {
	
	public GraphPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	WebDriver driver = Helper.getDriver();
	
	@FindBy(xpath ="//h5[text()='Graph']/..//a")
	WebElement getStartedGraphBtn;
	
	@FindBy(xpath ="//a[text()='Graph' and @href='graph']")
	WebElement graphLink;

	@FindBy(xpath ="//a[text()='Graph Representations']")
	WebElement graphRepresentationsLink;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement graphTryHereLink;
	
	@FindBy(xpath ="//button[text()='Run']")
	WebElement graphRunBtn;
	
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	WebElement graphPracticeQuestionsLink;
	
	// homepage
	@FindBy(xpath = "//a[contains(text(), 'Data Structures')]")
	WebElement dropdown;
	
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement graphDropdown;
	
	public void clickGetStartedOnGraph() {
		Loggerload.info("Click on graph "+ getStartedGraphBtn.getText()+ " link");
		Utils.webClick(getStartedGraphBtn);
	}
	
	public void clickOnGraph() {
		Loggerload.info("Click on graph "+ graphLink.getText()+ " link");
		Utils.webClick(graphLink);
	}
	
	public void clickOnGraphPracQuesLink() {
		Utils.webClick(graphPracticeQuestionsLink);
		Loggerload.info("User clicked on Graph Practice Questions link");
	}
	public void clickOnGraphRepresentation() {
		Loggerload.info("Click on graph "+ graphRepresentationsLink.getText()+ " link");
		Utils.webClick(graphRepresentationsLink);
	}
	
	public void clickGraphTryHereLink() throws InterruptedException {
		Loggerload.info("Click on graph "+ graphTryHereLink.getText()+ " link");
		Utils.webClick(graphTryHereLink);
	}

	public void clickGraphRunButton() {
		Utils.webClick(graphRunBtn);
	}

	public void dropDownGraphClick() {
		Loggerload.info("user clicked on Data Structure dropdown");
		Utils.webClick(dropdown);
		Loggerload.info("user selected graph from data structures dropdown");
		Utils.webClick(graphDropdown);
	}
}