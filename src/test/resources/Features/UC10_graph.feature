@graph
Feature: Graph
  I want to use this template for my feature file

  Scenario: User validate Get Started On Graph page
    Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button on Graph
    Then It should navigate to corresponding page with title "Graph"
    When user click on Graph
    Then It should navigate to corresponding page with title "Graph"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Graph" |
    And click on run button
    Then User navigate back

  Scenario: User validate Graph Representations page
    When user click on Graph Representations
    Then It should navigate to corresponding page with title "Graph Representations"
    When user clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Graph Representations" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    
  Scenario: The user is able to navigate to Graph Data Structure Page
    Given The user is at home page with title "NumpyNinja"
    When The user clicks the graph item from the drop down menu
    Then It should navigate to corresponding page with title "Graph"
    
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
		Given The user is in a page having an tryEditor with a Run button to test
		When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And click on run button
    Then The user gets an error message
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: The user is able to navigate to graph representations page and click on Practice Questions
    Given The user is in Editor page and navigates to graph representations page
    When the user clicks on Practice Questions in graph representations page
    Then The user is directed to graph Practice page
		Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"