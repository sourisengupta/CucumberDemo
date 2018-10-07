Feature: Contact features

Background:
Given User is on home page

@SmokeTest @RegressionTest @Contacts
Scenario Outline: Create new contacts scenario

When User enters "<username>" and "<password>" and click login button
Then user click on New Contact link
Then user enters contact details "<firstname>" "<lastname>" "<nickname>" "<position>" "<department>"
Then user click save button

Examples:
	|username	|password|firstname	|lastname	|nickname	|position	|department	|
	|souris 	|test@123|John		|Travolta	|Worldpay	|Leader		|Contractor	|
	|ssengupta	|test@123|Will		|Smith		|Vantiv		|Engineer	|Leader		|
	|souris		|test@123|Bruce		|willis		|Vantiv		|Engineer	|Contractor	|
	
@RegressionTest	@Search
Scenario Outline: Search Contacts
	

When User enters "<username>" and "<password>" and click login button
Then User enters search "<string>" in the search box and click Search button
Then Result should display in the page


Examples:
	|username	|password	|string	|
	|souris 	|test@123	|John	|
	|ssengupta	|test@123	|abcd	|	
