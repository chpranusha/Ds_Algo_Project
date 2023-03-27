@register
Feature: Register

  Background: 
    Given user opens browser and launch the url "https://dsportalapp.herokuapp.com/"
    When user clicks on "Get started" button
    And clicks on register link
    Then user should successfully able to see register page title "Registration"

	@register_001
  Scenario Outline: Register validation with valid inputs
    When user enter the "<username>", "<password>", "<passwordConfirmation>"
    And user click on register button
    Then user should be successfully able to see the label as "New Account Created."
    Then user click on Sign Out

    Examples: 
      |username|password|passwordConfirmation|
      |ninjaqueens@gmail.com|ninjaqueens@23|ninjaqueens@23|
      |valli123@gmail.com|pratham@23|pratham@23|

      @register_002
  Scenario Outline: Register validation with invalid inputs
    When user click register link without entering anything
    Then user should get fillout field error message "Please fill out this field." below username field.
    
    
	@register_003
  Scenario Outline: Register validation with invalid inputs/blank fields
    When user enters "<username>" with username and click on register button
    Then user should get fillout field error message "Please fill out this field." 

    
     Examples: 
      | username        | password  | passwordConfirmation |
      | swapna321@gmail.com |           |                      |
      
@register_004
Scenario Outline: Register validation with invalid inputs/blank fields
    When user enters "<username>" "<password>"  with username and password fields  and click on register button
    Then user should get error message password confirmation "Please fill out this field."
    Examples: 
      | username        | password  | passwordConfirmation |
      | rawali32@gmail.com | ninja@123 |                      |
    
@register_005
Scenario Outline: Register validation with invalid inputs/blank fields
    When user enters  "<password>" "<passwordconfirmation>" with password,password confirmation fields blank inputs and click on register button
    Then user should get error message user name "Please fill out this field." 
    
    Examples: 
      | username        | password  | passwordConfirmation |    
      |                 | pranu@321   | pranu@321              |
  
  @register_006
  Scenario Outline: Register validation with invalid inputs/blank fields
    When user enters  "<password>"  with password field  and click on register button
    Then user should get error message under user name  "Please fill out this field." 
    
    Examples: 
      | username        | password  | passwordConfirmation |
      |                 | swathininja@123   |                      |
 
@register_007
Scenario Outline: Register validation with invalid inputs/blank fields
    When user enters "<passwordconfirmation>" with passwordconfirmation and click on register button
    Then user will get error message username "Please fill out this field." 
    
    Examples: 
      | username        | password  | passwordConfirmation |
      |                 |           | numpy@123              |

@mismatchpwd
  Scenario Outline: Register validation with invalid inputs/ password mismatch
    When user enters "<username>" "<password>" "<passwordConfirmation>" with mismatching passwords
    Then user should get a password mismatch error message "password_mismatch:The two password fields didn’t match."

    Examples: 
      | username        | password  | passwordConfirmation |
      | rawali123@gmail.com | queen@123 | quee@123             |

@atleasteight
  Scenario Outline: Register validation with invalid inputs/ password format less than eight characters
    When user enters "<username>" "<password>" "<passwordConfirmation>" password less than eight characters
    Then user should get password atleast eight char error message "password should contain atleast eight characters."
    Examples: 
      | username        | password | passwordConfirmation |
      | pranusha2023@gmail.com | ninja    | ninja              |

@allnumeric
  Scenario Outline: Register validation with invalid inputs/  password format all numeric
    When user enters "<username>" "<password>" "<passwordConfirmation>" password with all numeric input
    Then user should get enter valid input error message "please enter valid password format"

    Examples: 
      | username        | password     | passwordConfirmation     |
      | pushpa@gmail.com |    987654321 |                987654321 |

@compareUnPwd
  Scenario Outline: Register validation with invalid inputs/ similar fields
    When user enters the "<username>" "<password>" "<passwordConfirmation>" all similar to one another
    Then user should get password not similar to username error message "password can not be similar as username"
    Examples: 
      | username  | password  | passwordConfirmation |
      | valli@1234 | valli@1234 | valli@1234            |