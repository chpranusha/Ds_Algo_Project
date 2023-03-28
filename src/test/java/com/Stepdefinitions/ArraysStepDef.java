package com.Stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Pageobjects.Arrays;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Pageobjects.DataStructures;
import com.Pageobjects.Getstarted;
import com.Pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysStepDef extends BaseClass {
	WebDriver driver = Helper.getDriver();
	static String expectedMsg;
	Getstarted sp = new Getstarted(Helper.getDriver());
	LoginPage lp = new LoginPage(Helper.getDriver());
	DataStructures ds = new DataStructures(Helper.getDriver());
	Arrays ay= new Arrays(Helper.getDriver());
	
	@Then("click on Get started button in array")
	public void click_on_get_started_button_in_array() throws Exception {
		
		ay.clickGetStartedBtn();
	}

	@Then("It should navigate to corresponding array page with title {string}")
	public void it_should_navigate_to_corresponding_array_page_with_title(String title) {
		Assert.assertEquals(Helper.getTitle(), title);
	}

	@When("user click on Arrays in Phython")
	public void user_click_on_arrays_in_phython() {
		ay.clickArraysInPythonLink();
		ay.clickArraysInPythonLink();
	}

	@When("user enter the Python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) {
		List<List<String>>data=pythonCode.cells();
		ay.enterPythonCode(data.get(0).get(0));
	}

	@Then("The result should be displayed below the run button")
	public void the_result_should_be_displayed_below_the_run_button() {
		//Allure.addAttachment("Python output", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	    driver.navigate().back();
	}

	@Then("User navigate back")
	public void user_navigate_back() {
		driver.navigate().back();
	}
	//Scenario second i,e arrays using list steps from feature file
	@When("User click on Arrays using list")
	public void user_click_on_arrays_using_list() {
		ay.clickOnArrayUsingListLink();
	}
	
	//Scenario third i,e arrays using Basic operation in list steps from feature file
	@When("User click on Basic Operations in list")
	public void user_click_on_basic_operations_in_list() {
		
		ay.clickOnBasicOperationsInListsLink();
	}
	//Scenario fourth i,e applications of arrays steps from feature file
	@When("User click on Applications of Array")
	public void user_click_on_applications_of_array() {
		ay.clickOnApplicationsOfArrayLink();
	}
	@When("user click on Practice Questions")
	public void user_click_on_practice_questions() {
		ay.clickOnPraticeQuestionsLink();
	}
	//Scenario fifth i,e Practice questions with search arrays sub link steps from feature file
	@When("user click on Search the array")
	public void user_click_on_search_the_array() {
		
		ay.clickOnSearchTheArrayLink();
	}
	@When("user clear the text and enter the Python code in tryEditor from sheet {string} and {int}")
	public void user_clear_the_text_and_enter_the_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ay.clearEditorCode();
		ay.enterCodePractice(sheetName, rowNumber);
		expectedMsg = ay.getExpectedResult(sheetName, rowNumber);
	}
	//Scenario six i,e Practice questions with MaxConsecutiveOnes sub link steps from feature file
	@When("user click on Max Consecutive Ones")
	public void user_click_on_max_consecutive_ones() {
		ay.clickOnMaxConsecutiveLink();
	}
	//Scenario seven i,e Practice questions with Even Number of Digits sub link steps from feature file
	@When("user click on Find Numbers with Even Number of Digits")
	public void user_click_on_find_numbers_with_even_number_of_digits() {
		ay.clickOnFindEvenLink();
	}
	//Scenario eight i,e Practice questions with Sorted Array sub link steps from feature file
	@When("user click on Find Numbers with Squares of  a Sorted Array")
	public void user_click_on_find_numbers_with_squares_of_a_sorted_array() {
		ay.clickOnSortedArrayLink();
	}
	//Scenario nine i,e Practice questions submit code in tryEditor for Search the array link steps from feature file
	
	@Given("The user is on {string} page of {string} after logged in")
	public void the_user_is_on_page_of_after_logged_in(String question, String section) {
		Loggerload.info("The user is on " + question + "page of " + section + " after logged in");
		String page_name = question + section.replaceAll("\\s+", "");
		//arrayPage = new ArraysPage(driver);
		ay.navigateTo(page_name);
	}
	@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		//arrayPage = new ArraysPage(driver);
		ay.enterCodePractice(sheetName, rowNum);
		expectedMsg = ay.getExpectedResult(sheetName, rowNum);
	}
	
	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
	    ay.clickOnSubmitButton();
	}
	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		String actualMsg = ay.getActualResult();
		Loggerload.info("Actual result of successful submission message :" + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}
	
	//Scenario ten i,e Practice questions->Max consecutive steps->try editor->run

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		String actualMsg = ay.getActualResult();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}
	
	//Scenario sixteen i,e invalid syntax in try editor for arrays

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		ay.navigateTo("tryeditorurl");
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = Helper.getTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		ay.clearEditorCode();
		ay.enterPythonCode(sheetName, rowNum);
		expectedMsg = ay.getExpectedResult(sheetName, rowNum);
	}
	
	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
	    ay.clickOnArrayRunbtn();
	}
	
	@Then("The user should be presented with error message as {string}")
	public void the_user_should_be_presented_with_error_message_as(String expectedmsg) {
		String actualMsg = ay.getErrorText();
		Loggerload.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg, expectedmsg, "Result do not match");
	}
	
	//Scenario seventeen i,e invalid syntax in try editor for arrays
//This methdod is copied from common stepdefs page
	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		Loggerload.info("Invalid code is taken from excel and clicked on run button");
		String actualMsg = ay.getErrorText();
		Loggerload.info("Error message for invalid python code is -" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}
	
	
	
	
	
}
