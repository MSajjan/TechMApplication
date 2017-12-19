Feature: Automate ToolsQa Application

@Regression @Smoke
 Scenario: Print title, url
      //Given User is on page
	    When I open seleniumframework website
	    Then I validate title and URL
	    And Click on Browse button
		Then Provide the path of the file to upload


    
@First
Scenario: This is First Scenario
	Given this is the first step
	When this is the second step
 
 
@Second
Scenario: This is Second Scenario
	Given this is the first step
	When this is the second step
 