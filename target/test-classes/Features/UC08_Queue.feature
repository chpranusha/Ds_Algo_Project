@queue
Feature: Queue

	@Queue_002
  Scenario: User validate Implementation of Queue in Python page
    Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button on Queue
    And It should navigate to corresponding page with title "Queue"
    When user click on Implementation of Queue in Python
    And It should navigate to corresponding page with title "Implementation of Queue in Python"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation of Queue in Python" |
    And click on run button
    Then User navigate back

	@Queue_003
  Scenario: User validate Implementation using collections.deque page
    When user click on Implementation using collections.deque
    And It should navigate to corresponding page with title "Implementation using collections.deque"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation using collections" |
    And click on run button
    Then User navigate back

	@Queue_004
  Scenario: User validate Implementation using array page
    When user click on Implementation using array
    And It should navigate to corresponding page with title "Implementation using array"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation using array" |
    And click on run button
    Then User navigate back

	@Queue_005
  Scenario: User validate Queue Operations page
    When user click on Queue Operations
    And It should navigate to corresponding page with title "Queue Operations"
    When user clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Queue Operations" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    
  @Queue_006
  Scenario Outline: The user is able run code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And click on run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

	@Queue_007
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And click on run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
  
  @Queue_008
  Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
    Given The user is in Editor page and navigates to QueueOp page
    When the user clicks on Practice Questions
    Then The user is directed to Practice page
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"