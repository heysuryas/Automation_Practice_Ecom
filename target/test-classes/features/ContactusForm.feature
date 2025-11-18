Feature: User contact us functionlality
Scenario: User able share contactUs form  

Given User on homepage
When User clicks on contact us button 
And User enters below details
  | Name                    | Email        			|Subject	|Message|
  | Suryas				    | testsurya111@gmail.com|Testcase	|QueryonTestcase|
And User browse uploads file
And User clicks on submit button
Then User able to view Sucess message 