package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Loggerload;
import com.Utils.Utils;

//import stepDefinitions.BaseClass;

public class Getstarted {

	public Getstarted (WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }
	
	  //Writing Xpaths for get started page from dropdrown

	  @FindBy(xpath="//button[text() = 'Get Started']")
	  //Cachelookup annotation helps to save a webelement instead of searching it again and again
	  @CacheLookup WebElement getStartedBtn;
	  
	  @FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	  @CacheLookup WebElement drpdown;
	  
	  @FindBy(xpath=("//a[@class='dropdown-item' and @href='/array']"))
	  @CacheLookup WebElement dropdown_array;
	  
	  @FindBy (xpath="//a[text()='Linked List']") 
	  @CacheLookup WebElement dropdown_linkedlist;
	  
		@FindBy (xpath="//a[text()='Stack']")	
		@CacheLookup WebElement dropdown_stack;	
		
		@FindBy (xpath="//a[text()='Queue']") 	
		@CacheLookup WebElement dropdown_queue;	
		
		@FindBy (xpath="//a[text()='Tree']") 	
		@CacheLookup WebElement dropdown_tree;
		
		@FindBy (xpath="//a[text()='Graph']") 	
		@CacheLookup WebElement dropdown_graph;
	  
	  @FindBy(xpath = "//div[contains(text(),'You are not logged in')]")
	  //@FindBy(xpath = "//div[@class = 'alert alert-primary']")
	  @CacheLookup WebElement startPageErrorMsg;
	  
		//@FindBy (xpath="//*[@class='alert alert-primary']")WebElement alert_msg;

	  //Writing Xpaths for get started page from the get started button available for each option
	  
	  @FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']") 
		@CacheLookup  WebElement getStartedBtn_DS;	
	  
		@FindBy(xpath = "//a[text()='NumpyNinja']") 	
		@CacheLookup 	WebElement homePageTitle;
	  
		@FindBy(xpath = "//h5[text()='Array']/..//a[text()='Get Started']") 	
		@CacheLookup  WebElement getStartedBtn_array;
		
		@FindBy(xpath = "//h5[text()=Linked List']/..//a[text()='Get Started']") 
		@CacheLookup 	WebElement getStartedBtn_linkedlist;
		
		@FindBy(xpath = "//h5[text()='Stack']/..//a[text()='Get Started']") 
		@CacheLookup 	WebElement getStartedBtn_stack;
		
		@FindBy(xpath = "//h5[text()='Queue']/..//a[text()='Get Started']") 
		@CacheLookup 	WebElement getStartedBtn_queue;
		
		@FindBy(xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") 	
		@CacheLookup 	WebElement getStartedBtn_tree;	
		
		@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")  
		@CacheLookup    WebElement getStartedBtn_graph;

	  //Actions 
	  
	  public void clickGetStartedBtn() throws Exception {
			 Loggerload.info("click on getStartedPage "+getStartedBtn.getText()+" button");
			 Utils.webClick(getStartedBtn);
	    }
		 
		public String validateHomePage() {
			String text = homePageTitle.getText();
			return text;
	    }
		 
		public void dropDownSelect() throws InterruptedException {
			 Thread.sleep(1000);
			 Utils.webClick(drpdown);
			 Loggerload.info("click on getStartedPage "+drpdown.getText()+" button");
	    }
		
		public void dropDownClick() throws InterruptedException {
			 Thread.sleep(1000);
			 Utils.webClick(dropdown_array);
	    }
		
		public String alertMessage() {
			String text = startPageErrorMsg.getText();
			return text;

	    }
		public void getStartedClick() throws InterruptedException {
			 Thread.sleep(1000);
			 Utils.webClick(getStartedBtn_array);
	    }	
		
}  
	

