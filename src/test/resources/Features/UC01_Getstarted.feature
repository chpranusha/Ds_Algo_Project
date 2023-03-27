@getstarted
Feature: Get Started page

  Scenario: validation of Start Page
    Given User launch Browser and enters url "https://dsportalapp.herokuapp.com/"
    When User clicks on Get Started button
    Then The user  should be successfully redirected to home page
    Then The user clicks on data structure dropdown
    When The user select any dropdown menu "<dropdown>"
    Then It should Alert the user with the message "You are not logged in"
    When The user click any of the Get started button in home page
    Then It should Alert the user with the message "You are not logged in"
