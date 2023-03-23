package com.Pageobjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.Utils;

public class DataStructures {
	
	public DataStructures(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath ="//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")
	WebElement getStartedLinkDs;
	
	@FindBy(xpath ="//a[text()='Time Complexity']")
	WebElement timeComplexityLink;
	
	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryHereLink;
	
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement textEditor; 
	
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	public void clickGetStartedDs() throws Exception  {
		Thread.sleep(1000);
		Loggerload.info("Click on dsIntro "+ getStartedLinkDs.getText()+ " link");
		Utils.webClick(getStartedLinkDs);
	}
	
	public void clickTimeComplexityLink() throws Exception {
		Thread.sleep(1000);
		Loggerload.info("Click on dsIntro "+ timeComplexityLink.getText()+ " link");
		Utils.webClick(timeComplexityLink);
	}
	
	public void clickTryHereLink() throws Exception {
		Thread.sleep(1000);
		Loggerload.info("Click on dsIntro "+ tryHereLink.getText()+ " link");
		Utils.webClick(tryHereLink);
	}
	
	public void enterCode(String pythonCode) throws Exception {
		Loggerload.info("Entering code on dsIntro "+ textEditor.getText()+ " text field");
		Utils.enterPythonCode(textEditor, pythonCode);
	} 
	
	public void clickRunBtn() throws Exception {
		Thread.sleep(1000);
		Loggerload.info("Click on dsIntro "+ runBtn.getText()+ " button");
		Utils.webClick(runBtn);
	}
	
}
