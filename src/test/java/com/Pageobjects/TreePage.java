package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.BaseClass;
import com.Utils.Utils;

public class TreePage extends BaseClass  {
	
	 public TreePage(WebDriver webDriver) {
		 
			PageFactory.initElements(webDriver, this);
		}
	 
	 @FindBy(xpath ="//h5[text()='Tree']/..//a[text()='Get Started']")
		WebElement getStartedBtn;
	 
	 @FindBy(xpath ="//a[text()='Overview of Trees']")
		WebElement overviewOfTreeslink;
	 
	 @FindBy(xpath ="//textarea[@tabindex='0']")
		WebElement textEditor;
	 
		@FindBy(xpath ="//button[text()='Run']")
		WebElement runBtn;
		
		@FindBy(xpath ="//a[text()='Terminologies']")
		WebElement terminologiesLink;
	 
	 @FindBy(xpath ="//a[text()='Types of Trees']")
		WebElement typesOfTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Tree Traversals']")
		WebElement treeTraversalsLink;
	 
	 @FindBy(xpath ="//a[text()='Traversals-Illustration']")
	 	WebElement traversalsIllustrationLink;
	 
	 @FindBy(xpath ="//a[text()='Binary Trees']")
	 	WebElement binaryTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Types of Binary Trees']")
	 	WebElement typesOfBinaryTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Implementation in Python']")
	 	WebElement implementationInPythonLink;
	 
	 @FindBy(xpath ="//a[text()='Binary Tree Traversals']")
	 	WebElement binaryTreeTraversalsLink;
	 
	 @FindBy(xpath ="//a[text()='Implementation of Binary Trees']")
	 	WebElement implementationOfBinaryTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Applications of Binary trees']")
	 	WebElement applicationsOfBinaryTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Binary Search Trees']")
	 	WebElement BinarySearchTreesLink;
	 
	 @FindBy(xpath ="//a[text()='Implementation Of BST']")
	 	WebElement implementationOfBSTLink;
	 	 
		public void clickGetStarted() {
			Utils.webClick(getStartedBtn);
	 }
		
	 public void clickRunBtn() {
			Utils.webClick(runBtn);
	 }
	 
	 public void clickoverviewOfTreeslink() {
			Utils.webClick(overviewOfTreeslink);
	 }

	 public void enterCode(String pythonCode) throws InterruptedException {
			Utils.enterPythonCode(textEditor, pythonCode);
	 } 

	 public void clickTerminologiesLink() {
			Utils.webClick(terminologiesLink);
	 }

	 public void clickTypesOfTreesLink() {
		 Utils.webClick(typesOfTreesLink);
	 }
	 
	 public void clickTreeTraversalsLink() {
		 Utils.webClick(treeTraversalsLink);
	 }
	 
	 public void clickTraversalsIllustrationLink() {
		 Utils.webClick(traversalsIllustrationLink);
	 }
	 
	 public void clickBinaryTreesLink() {
		 Utils.webClick(binaryTreesLink);
	 }
	 
	 public void clickTypesOfBinaryTreesLink() {
		 Utils.webClick(typesOfBinaryTreesLink);
	 }
	 
	 public void clickImplementationInPythonLink() {
		 Utils.webClick(implementationInPythonLink);
	 }
	 
	 public void clickBinaryTreeTraversalsLink() {
		 Utils.webClick(binaryTreeTraversalsLink);
	 }
	 
	 public void clickImplementationOfBinaryTreesLink() {
		 Utils.webClick(implementationOfBinaryTreesLink);
	 }
	 
	 public void clickApplicationsOfBinaryTreesLink() {
		 Utils.webClick(applicationsOfBinaryTreesLink);
	 }
	 
	 public void clickBinarySearchTreesLink() {
		 Utils.webClick(BinarySearchTreesLink);
	 }
	 
	 public void clickImplementationOfBSTLink() {
		 Utils.webClick(implementationOfBSTLink);
	 }
		
}