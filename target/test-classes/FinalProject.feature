 @test001
Feature: As a user we need to verify total price from Automation practice website 

 Scenario: Verify total price from Automation practice 
	Given user open web browser and navigate to Automation Practice
	And user click on sign in button 
	And user enter valid username and password
	And user click on login button 
	And user navigate to page to verify "My account - My Store" as page title 
	When user click on dress icon to see five items 
	Then user print all dress price in decending order 
	And user select the second dress on the list 
	And user add dress to the cart 
	And user click on proceed button
	Then user verify total price with shipping 
	And user logout from Automation practice 
	And user close the window