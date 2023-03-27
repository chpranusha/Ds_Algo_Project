package com.Pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.Utils;

	public class LoginPage { 

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[text()='Sign in']")
	WebElement signInLink;
	
	@FindBy(xpath ="//input[@value='Login']")
	WebElement logInBtn;
	
	@FindBy (xpath ="//a[text()='Register!']")
	WebElement registerLink;
	
	@FindBy (xpath ="//input[@value='Register']")
	WebElement validateRegisterBtn;
	
	@FindBy (xpath ="//input[@id='id_username']")
	WebElement usernameTxtBox;
	
	@FindBy (xpath="//input[@id='id_password']")
	WebElement passowrdTxtBox;
	
	@FindBy (xpath ="//a[text()='Sign out']")
	WebElement logoutLink;
	
	@FindBy (xpath ="//div[contains(text(),'You are logged in')]")
	WebElement successfulLoginMsg;
	
	@FindBy(xpath="//div[contains(text(),'Logged out successfully')]")
	WebElement successfulLogOutMsg;
	
	@FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]")
	WebElement invalidCredMsg;
	
	 
	
	 public void signInClick() throws Exception {
		 Loggerload.info("click on LoginPage "+signInLink.getText()+" link");
		 Utils.webClick(signInLink);
	 }
	 
	 public String validateSignInPage() throws InterruptedException {
		 Loggerload.info("click on LoginPage "+logInBtn.getText()+" button");
		 String text = logInBtn.getAttribute("value");
		 return text;
	 }
	 
	 public void registrationLinkClick() throws Exception {
		 PageFactory.initElements(Helper.getDriver(), this);
		 Loggerload.info("click on LoginPage "+registerLink.getText()+" link");
		 Utils.webClick(registerLink);
    }
	 
	public String validateRegBtn() {
		String text = validateRegisterBtn.getAttribute("value");
		return text;
    }
	 
	public void enterUserName(String value) throws InterruptedException {
		 Loggerload.info("sending keys on LoginPage "+usernameTxtBox.getText()+" input field");
		 Utils.webSendKeys(usernameTxtBox, value);
	}

	public void enterPassword(String value) throws InterruptedException {
		 Loggerload.info("sending keys on LoginPage "+logInBtn.getText()+" input field");
		 Utils.webSendKeys(passowrdTxtBox, value);
	}
	 
	 public void clickLogInBtn() throws InterruptedException {
		 Loggerload.info("click on LoginPage "+logInBtn.getText()+" button");
		 Utils.webClick(logInBtn);
	 }
	 
	 public void clickSignOutLink() throws InterruptedException {
		 Loggerload.info("click on LoginPage "+logoutLink.getText()+" button");
		 Utils.webClick(logoutLink);
	 }
	 public String validateSuccessLoginMsg() {
		String text = successfulLoginMsg.getText();
		return text;
	}
	 public String validateSuccessLogOutMsg() {
		String text = successfulLogOutMsg.getText();
		return text;
    }
	 
	public String validationEmptyFieldUserName() throws InterruptedException {
		String message = usernameTxtBox.getAttribute("validationMessage");
		System.out.println(message);
		Loggerload.info("Validating message on LoginPage "+usernameTxtBox.getText()+" textbox");
		return message;
	}
	
	public String validationEmptyFieldPassword() throws InterruptedException {
		String message = passowrdTxtBox.getAttribute("validationMessage");
		System.out.println(message);
		Loggerload.info("Validating message on LoginPage "+passowrdTxtBox.getText()+" textbox");
		return message;
	}
	public String validateInvalidCredMsg() {
		Loggerload.info("Validating message on LoginPage "+invalidCredMsg.getText());
		String text = invalidCredMsg.getText();
		return text;
	}
}