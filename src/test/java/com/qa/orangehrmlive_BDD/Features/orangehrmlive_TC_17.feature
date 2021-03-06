Feature: Validate of Dashboard Admin Application
Background: I am logged into Orange Application.
Given User successful login
Then validate Title of LandingPage

Scenario: Dashboard Admin Title 
Given When I click on Admin Link 
Then Click on Job 
And validate viewJobTitleList in URL
Then close TC17 browser