package com.Pageobjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Utils;

import com.Utils.Loggerload;

import com.Utils.ConfigReader;
import com.Utils.ExcelReader;

public class QueuePage {
	
	public QueuePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	WebDriver driver = Helper.getDriver();
	
	@FindBy(xpath ="//a[@href='queue']")
	WebElement getStartedArrayBt; 
	
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']")
	WebElement implementationOfQueueLink;
	
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")
	WebElement implentationCollectionLink;
	
	@FindBy(xpath="//a[text()='Implementation using array']")  
	WebElement implementationArrayLink;
	
	@FindBy(xpath="//a[text()='Queue Operations']")
	WebElement queueOperationsLink;
	
	@FindBy(linkText = "Practice Questions")
	WebElement PracticeQuestionsLink;
	
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement editorInput;
	
	@FindBy(id = "output")
	WebElement output;
	
	String qpracquesurl = ConfigReader.getQPracQuesUrl();
	String editorurl = ConfigReader.getEditorUrl();
	
	public void clickOnGetStartedQueue() {
		Utils.webClick(getStartedArrayBt);
	}
	
	public void clickOnImplementationOfQueue() {
		Utils.webClick(implementationOfQueueLink);
	}
	
	public void clickOnImplentationCollection() {
		Utils.webClick(implentationCollectionLink);
	}
	
	public void clickOnImplementationArray() {
		Utils.webClick(implementationArrayLink);
	}
	
	public void clickOnQueueOperations() {
		Utils.webClick(queueOperationsLink);
	}
	
	public void navigateToQPracQuesPage() {
		driver.get(qpracquesurl);
	}
	
	public void clickOnPracticeQuestionsLink() {
		PracticeQuestionsLink.click();
		Loggerload.info("User clicked on Practice Questions link");
	}
	
	public void navigateToEditorUrl() {
		driver.get(editorurl);
		Loggerload.info("User is in editor page");
	}
	
	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetname, rownumber);
		Utils.enterPythonCode(editorInput, code);
	}

	public String getExpectedResult(String sheetname, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = Utils.getResultfromExcel(sheetname, rowNum);
		return expectedResult;
	}
	
	public String getActualResult() {
		return output.getText();
	}
}