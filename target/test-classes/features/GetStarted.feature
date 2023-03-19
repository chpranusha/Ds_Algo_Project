Feature: Home page feature

Scenario:User validate Home page

Given The user opens DS Algo portal link

When User clicks on GetStarted button
Then The user should be redirected to homepage
When The user clicks Data Structures drop down
And   The user select one of the dropdown menu
Then It should Alert the user with the message "You are not logged in"
When The user clicks any of the Get started button in home page

Then It should Alert the user with the message "You are not logged in"
When The user clicks Sign in
Then The user should be redirected to Sign in page
When The user clicks Register
Then The user should be redirected to Register form
