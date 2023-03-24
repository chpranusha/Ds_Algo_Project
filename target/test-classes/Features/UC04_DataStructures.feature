
@dscenario
Feature: Data Structure Intro

	Background:
		Given user open browser and launch the url "https://dsportalapp.herokuapp.com/"
    When user click  "Get started" button
    And click on signin link
    When user enters  "Pranushadsalgo@gmail.com" "ninjaqueens@23"
    And user click on login button
    
	Scenario: Data Structure Intro Page Validation
 		Given The user is at home page with title "NumpyNinja"
    When user click on Get started button in Data Structure
    Then user will successfully navigate to corresponding page with title "Data Structures-Introduction"
    When user click on Time Complexity
    Then It should navigate to corresponding page with title "Time Complexity"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the python code 
      | print("Data Structures Introduction")|
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"