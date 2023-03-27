
@login
Feature: Login

  Background: 
    Given user opens browser and launch the url"https://dsportalapp.herokuapp.com/"
    When user click on "Get started" button
    And clicks on signin link
    
    Then user will successfuly able to see signIn page

  @login
  Scenario Outline: signIn validation with valid inputs
    When user clicks on Register link on signIn page
    Then user should be successfully redirected to register page
    When user clicks on signin link
    When user enters valid "<username>" "<password>"
    And user will click on login button
    Then user should be successfully able to see the messgae "You are logged in"
    Then user will click on logOut button
    And user will successfully loggesOut

    Examples: 
      | username               | password   |
       |Pranushadsalgo@gmail.com|ninjaqueens@23|
  @login
  Scenario: signIn validation with inValid inputs
    When user click on signIn without entering anything on textbox
    Then user should get error msg "Please fill out this field."

  @login
  Scenario Outline: signIn validation with inValid inputs
    When user enters  "<username>"  and click on SignIn
    Then user should be able to see error message "Please fill out this field." below password field.

    Examples: 
      | username      | password |
      | swapna321@gmail.com |        |
  
  @login
  Scenario Outline: signIn validation with inValid inputs
    When user enters invalid "<username>" "<password>" and click on SignIn
    Then user should be able to see error message "Invalid Username and Password"

    Examples: 
      | username     | password |
      | rawali32@gmail.com | ninja@123 |   
