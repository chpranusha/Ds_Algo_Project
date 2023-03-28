package com.Pageobjects;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;
import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.Utils;

public class Arrays {
	public Arrays(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	WebDriver driver = Helper.getDriver();
	
	@FindBy(xpath ="//a[@href='array']")
	WebElement getStartedArrayBt; 
	
	@FindBy(xpath ="//a[text()='Arrays in Python']")
	WebElement arraysInPythonLink;
	
	@FindBy(xpath="//a[text()='Arrays Using List']")
	WebElement arraysUsingListLink;
	
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperationsInListsLink;

	@FindBy(xpath ="//a[text()='Applications of Array']")
	WebElement applicationsofArrayLink;
	
	@FindBy(partialLinkText = "Try here")
	WebElement tryHereBtn;
	
	@FindBy (xpath ="//textarea[@tabindex='0']")
	WebElement textEditor;
	
	@FindBy (xpath ="//*[@id='answer_form']")
	WebElement answerForm;
		
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	@FindBy(xpath="//*[@class='button']")
	WebElement submitButton;
	
	@FindBy(xpath ="//a[text()='Practice Questions']")
	WebElement praticeQuestionsLink;
	
	@FindBy(xpath ="//a[text()='Search the array']")
	WebElement searchtheArrayLink;
	
	@FindBy(xpath ="//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveLink;
	
	@FindBy(xpath ="//a[text()='Find Numbers with Even Number of Digits']")
	WebElement findEvenLink;
	
	@FindBy(xpath ="//a[text()='Squares of  a Sorted Array']")
	WebElement sortedArrayLink;
	
	@FindBy(id="output")
	WebElement output;
	
	public void clickGetStartedBtn() throws InterruptedException {
		Thread.sleep(1000);
		Loggerload.info("Before click " + getStartedArrayBt.getText() + " link ");
		Utils.webClick(getStartedArrayBt);
	}
	public void clickArraysInPythonLink() {
		Loggerload.info("Before click " + arraysInPythonLink.getText() + " link");
		Utils.webClick(arraysInPythonLink);
	}
	public void clickTryHereBtn() {
		Loggerload.info("Before click " + tryHereBtn.getText() + " button");
		Utils.webClick(tryHereBtn);
	}
	
	public void clickOnArrayUsingListLink() {
		Loggerload.info("Before click " + arraysUsingListLink.getText() + " link");
		Utils.webClick(arraysUsingListLink);
	}
	
	public void clickOnBasicOperationsInListsLink() {
		Loggerload.info("Before click " + basicOperationsInListsLink.getText() + " link");
		Utils.webClick(basicOperationsInListsLink);
	}
	
	public void clickOnApplicationsOfArrayLink() {
		Loggerload.info("Before click " + applicationsofArrayLink.getText() + "  link");
		Utils.webClick(applicationsofArrayLink);
	}
	public void clickOnArrayRunbtn() {
		Loggerload.info("Before click " + runBtn.getText() + "  button");
		Utils.webClick(runBtn);
	}
	
	public void clickOnPraticeQuestionsLink() {
		Loggerload.info("Before click " + praticeQuestionsLink.getText() + "  link");
		Utils.webClick(praticeQuestionsLink);
	}
	public void clickOnSearchTheArrayLink() {
		Loggerload.info("Before click " + searchtheArrayLink.getText() + " link");
		Utils.webClick(searchtheArrayLink);
	}
	public void clickOnMaxConsecutiveLink() {
		Loggerload.info("Before click " + maxConsecutiveLink.getText() + " link");
		Utils.webClick(maxConsecutiveLink);
	}
	public void clickOnFindEvenLink() {
		Loggerload.info("Before click " + findEvenLink.getText() + " link");
		Utils.webClick(findEvenLink);
	}
	public void clickOnSortedArrayLink() {
		Loggerload.info("Before click " + sortedArrayLink.getText() + " link");
		Utils.webClick(sortedArrayLink);
	}
		
	public void enterPythonCode(String pythonCode) {
		Loggerload.info("Before entering text in " + textEditor.getText() + " input field");
		Utils.enterPythonCode(textEditor, pythonCode);
	}
	
	public void enterPythonCode(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetName, rowNumber);
		Utils.enterPythonCode(textEditor, code);
	}
	
	public void clickOnSubmitButton() {
		Loggerload.info("Click on Submit button");
		submitButton.click();
	}
	public void enterCodePractice(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetName, rowNumber);
		Utils.enterCodePractice(textEditor, answerForm, code);
	}
	public String getActualResult() {
		Utils.waitForElement(output);
		return output.getText();
	}
	
	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = Utils.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	
	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}
	
	public void clearEditorCode() {
		Utils.clearCodeFirst(textEditor);
	}
}
