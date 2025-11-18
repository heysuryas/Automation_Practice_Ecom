


Feature: User login functionlality
Scenario: User login successfully with valid credentials. 
Given User launches the browser 
When User click on 'Signup or Login' button
And User enters login credentials
    | email            | password  |
    | testsurya111@gmail.com  | testsurya111|
And User clicks on Login button
Then User should be able to view the user page
