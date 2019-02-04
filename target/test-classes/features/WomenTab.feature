Feature: Clicking on Women Tab on Home Page 

Background: Initialize and navigate
	Given Initialize browser with chrome 
	And Navigate to "urllink" site 

@runThis
Scenario: Sub menus should be displayed after clicking on women tab 
	When user hover on women tab 
	Then verify that women tab should display sub menus
	And User close the browser 
	
Scenario: User should be able to click on "Tops" tab 
	When user clicks on "Tops" tab 
	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=4&controller=category" 
	
Scenario: User should be able to click on "T-shirts" tab 
	When user clicks on "T-shirts" tab 
	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=5&controller=category" 

Scenario: User should be able to click on "Blouses" tab 
	When user clicks on "Blouses" tab 
	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=6&controller=category" 


Scenario: User should be able to click on "Sortby" and select values from "Sortby" dropdowm
	And click on Women tab 
	When user clicks on Sortby tab 
	Then user should be able to select values from dropdown 

@runThis	
Scenario: User should be able to click on size "S" 
	And click on Women tab 
	When user clicks on "sizeS" checkbox 
	Then User should be able to click on checkbox
	And User close the browser

Scenario: User should be able click on "Add to cart" tab 
	And click on Women tab 
	When user select an item at position 0 clicks on Add to cart tab 
	Then user should be able to sucessfully add the item to cart 

Scenario: User should be able click on "More" tab 
	And click on Women tab 
	When user select clicks on More tab at position 0 
	Then user should be able to navigate to next page 

Scenario: User should be able to click on "checkout" tab 
	And click on Women tab 
	When user select an item at position 0 clicks on Add to cart tab 
	And user clicks on checkout tab 
	Then User should be able to navigate to site "http://automationpractice.com/index.php?controller=order" 

Scenario: I should be able to search "Blouses" form serach button 
	When i search for "Blouses" in serach text box 
	Then search results should find "1" items 

Scenario: I should be able to search "T-shirts" from search button 
	When i search for "T-shirts" in serach text box 
	Then search results should find "1" items
	 
Scenario: I click on "SendToAFrnd" button then new window opens 
	And user select an item at position 2 and 2 
	When user clicks on send to a friend tab 
	Then it should open new window
	And User close the browser

Scenario: I send email to friend 
	And user select an item at position 2 and 2 
	And user clicks on send to a friend tab 
	And it should open new window 
	When i enter "priya" and "priya@gmail.com" and clicks on send button 
	Then i should be able to send an email to friend 

Scenario: It should show message as "You must be logged in" when i click on "Add to wishlist" tab 
	And user select an item at position 2 and 2 
	When user clicks on Add to wishlist tab 
	Then user should see message as you must be logged in