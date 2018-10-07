Feature: Deals features

@SmokeTest @RegressionTest @Deals
Scenario Outline: Create new Deals scenario
Given User is on home page
When User enters "<username>" and "<password>" and click login button
Then user click on New Deal link
Then user enters Deal details "<title>" "<amount>" 
Then user click save button in deal page

Examples:
	|username	|password|title		|amount	|
	|souris 	|test@123|DEAL100	|100	|
	|souris		|test@123|DEAL50	|50		|
	
@RegressionTest	@Search
Scenario Outline: Search Deals
	

When User enters "<username>" and "<password>" and click login button
Then User enters search "<string>" in the search box and click Search button
Then Result should display in the page


Examples:
	|username	|password	|string		|
	|souris 	|test@123	|DEAL100	|
	|ssengupta	|test@123	|DEAL50		|	
