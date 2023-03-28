@linkedlist
 Feature: LinkedList

@linkedlist
Scenario: validating Linked List introduction page
		Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button in Linkedlist section
    Then user should navigate to corresponding page with title "Linked List"
    When user click on Introduction
    Then user should navigate to corresponding page with title "Introduction"
    When user clicks on Try here
   And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      |print("LinkedList Introduction")|
    And click on run button
	Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"
 
 @linkedlist   
Scenario: User validate Creating Linked List page
    When user click on Creating Linked List
    Then user should navigate to corresponding page with title "Creating Linked LIst"
    When user clicks on Try here
 		And It should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      |print("Creating Linked List")|
    And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"
    
@linkedlist   
Scenario: User validate Types of Linked List page
    When user click on Types of Linked List
   And It should navigate to corresponding page with title "Types of Linked List"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      | print("Types of Linked List")|
   And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"

@linkedlist   
Scenario: User validate Implement Linked List in Python page
    When user click on Implement Linked List in Python
    Then user should navigate to corresponding page with title "Implement Linked List in Python"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      | print("Implement Linked List in Python")|
    And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"
    
@linkedlist   
Scenario: User validate Traversal page
    When user click on Traversal link
    Then user should navigate to corresponding page with title "Traversal"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      |print("Traversal")|
    And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"
    
@linkedlist   
Scenario: User validate Insertion page
    When user click on Insertion link
    Then user should navigate to corresponding page with title "Insertion"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      |print("Insertion")|
   And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/"
    
@linkedlist   
Scenario: User validate Deletion page
    When user click on Deletion link
    Then user should navigate to corresponding page with title "Deletion"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      | print("Deletion")|
   And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/linked-list/" 
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
