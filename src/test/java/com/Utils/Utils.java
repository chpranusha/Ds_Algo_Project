package com.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Random;
import java.util.Map;
import java.util.Random;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utils {
static String Excelpath = ConfigReader.getexcelfilepath(); //getexcelpath method in configreader
	
	public static int getRandomNum() {
		Random random = new Random();
		 return random.nextInt(100000);
				
	}
	//initialized in hooks
	public static WebDriver driver = Helper.getDriver(); //getting driver which is already initialized in helper class

	public static boolean webClick(WebElement element) {
		//to avoid no such element found exception
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			//to check if an element is visible on a page
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						ele.click();					
						return true;
					}
					catch(Exception e) {
						//to avoid undefined element exception
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean webSendKeys(WebElement element, String text) {
		//to avoid no such element found exception
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
		
		//to check if the element is displayed to locate
		if(ele.isDisplayed()) {
			if(ele.isEnabled()) {
				try {
					ele.clear();
					ele.sendKeys(text);
					return true;
				}
				catch(Exception e) {
					//to avoid element not found exception
					((JavascriptExecutor) driver).executeScript("arguments[0].value='"+text+"';", ele);
				}	
			}
			else {
				throw new Exception("Element is not enabled");
			}
		}
		else {
			throw new Exception("Element is not displayed");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
}
	public static boolean enterPythonCode(WebElement element, String code) {
		Loggerload.info("Before sending keys to " + element.getText() );
		try {
			new Actions(driver).sendKeys(element, code).perform();
		} catch(Exception e) {
			element.sendKeys(code);
		}
		return true;
	}
	
	public static void clearCodeFirst(WebElement element) {
		Loggerload.info("Clearing text in editor");
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
	} 
	
	public static void enterCodePractice(WebElement element, WebElement answerForm, String code) {
		Loggerload.info("Clearing text before entering code in "+element.getText()+" enterCodePractice");
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(answerForm));
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
//		element.sendKeys(code);
	}
	public static String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		String result = testdata.get(rownumber).get("Result");
		Loggerload.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
		return result;
	}
	
	public static String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		String code = testdata.get(rownumber).get("pythonCode");
		return code;
	}
	
	public static boolean webSelect(WebElement element, String text) {
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						new Select(ele).deselectByVisibleText(text);

//						reporting and logging here
						return true;
					}
					catch(Exception e) {
//						((JavascriptExecutor) driver).executeScript("arguments[0].value='"+text+"';", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	public static void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));		
	}
}
