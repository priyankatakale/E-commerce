Feature: Clicking on Women Tab on Home Page 

#Scenario: Sub menus should be displayed after clicking on women tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	When user hover on women tab 
#	Then verify that women tab should display sub menus 

#Scenario: User should be able to click on "Tops" tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	When user clicks on "Tops" tab 
#	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=4&controller=category" 

#Scenario: User should be able to click on "T-shirts" tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	When user clicks on "T-shirts" tab 
#	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=5&controller=category" 

#Scenario: User should be able to click on "Blouses" tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	When user clicks on "Blouses" tab 
#	Then user should be able to navigate to site "http://automationpractice.com/index.php?id_category=6&controller=category" 

#Scenario: 
#	User should be able to click on "Sortby" and select values from "Sortby" dropdowm
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	And click on Women tab 
#	When user clicks on Sortby tab 
#	Then user should be able to select values from dropdown 

#Scenario: User should be able to click on size "S" 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	And click on Women tab 
#	When user clicks on "sizeS" checkbox 
#	Then User should be able to click on checkbox 

#Scenario: User should be able click on "Add to cart" tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	And click on Women tab 
#	When user select an item at position 0 clicks on Add to cart tab
#	Then user should be able to sucessfully add the item to cart

#Scenario: User should be able click on "More" tab 
#	Given Initialize browser with chrome 
#	And Navigate to "urllink" site 
#	And click on Women tab 
#	When user select clicks on More tab at position 0 
#	Then user should be able to navigate to next page 

Scenario: User should be able to click on "checkout" tab 
	Given Initialize browser with chrome
	And Navigate to "urllink" site 
	And click on Women tab
	When user select an item at position 0 clicks on Add to cart tab
	And user clicks on checkout tab
	Then User should be able to navigate to site "http://automationpractice.com/index.php?controller=order"