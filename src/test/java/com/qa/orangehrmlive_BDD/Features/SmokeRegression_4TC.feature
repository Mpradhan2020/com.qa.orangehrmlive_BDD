Feature: Feature: Validate of OrangeHRP Application for Smoke & Regression
Background: Initialize browser
Given  user open the browser
Then  user run URL

@RegressionTest 
Scenario: login OrangeHRM Live Application
Given I am in OrangeHRP Application Page   
Then login to the Application
When landing page is available to user 
Then click on Admin menu
Then close Browser


@SmokeTest
Scenario: Admin Title verification 
Given I am in OrangeHRP Application Page
Then login to the Application
When landing page is available to user 
Then click on Admin menu
And Verify the title contains admin
Then close Browser

@SmokeTest@RegressionTest
Scenario: Dashboard Title verification 
Given I am in OrangeHRP Application Page
Then login to the Application
When landing page is available to user 
Then click on Dashboard menu
And Verify the title contains dashboard
Then close Browser

@RegressionTest
Scenario: Dashboard Title verification 
Given I am in OrangeHRP Application Page
Then login to the Application
When landing page is available to user 
Then click on Leave menu
And Verify the title contains leave
Then close Browser