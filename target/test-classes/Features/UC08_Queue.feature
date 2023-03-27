Feature: Queue
  

  Scenario: User validate Implementation of Queue in Python page
    Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button on Queue
    And It should navigate to corresponding page with title "Queue"
    When user click on Implementation of Queue in Python
    And It should navigate to corresponding page with title "Implementation of Queue in Python"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Implementation of Queue in Python" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation using collections.deque page
    When user click on Implementation using collections.deque
    And It should navigate to corresponding page with title "Implementation using collections.deque"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Implementation using collections" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation using array page
    When user click on Implementation using array
    And It should navigate to corresponding page with title "Implementation using array"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Implementation using array" |
    And click on run button
    Then User navigate back

  Scenario: User validate Queue Operations page
    When user click on Queue Operations
    And It should navigate to corresponding page with title "Queue Operations"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the python code
      | print"Queue Operations" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"