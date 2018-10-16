@CoreFeature
Feature: Login functionality

@RegressionTest
Scenario Outline: User login with successful credentials

Given User is on home page
When User enters "<username>" and "<password>" and click login button
Then user is on My Account page

Examples: 
	|username	|password|
	|souris	 	|test@123|
	|ssengupta 	|test@123|	
	