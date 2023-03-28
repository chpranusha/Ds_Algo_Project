@stack
Feature: Stack

  Scenario: User validate Stack Main page
    Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button on Stack
    Then It should navigate to corresponding page with title "Stack"
    When user click on Operations in Stack
    Then It should navigate to corresponding page with title "Operations in Stack"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
  When user enter the python code
      | print"Operations in Stack" |
    And click on run button
   Then User navigate back

  Scenario: User validate Implementation page
    When user click on Implementation
    Then It should navigate to corresponding page with title "Implementation"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Implementation" |
    And click on run button
    Then User navigate back

  Scenario: User validate Applications page
    When user click on Applications
    Then It should navigate to corresponding page with title "Applications"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Applications" |
    And click on run button
    Then User navigate back
    
   Scenario: User validate Practice Questions page
    When user click on Practice Questions
    Then It should navigate to corresponding page with title "Practice Questions"
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"