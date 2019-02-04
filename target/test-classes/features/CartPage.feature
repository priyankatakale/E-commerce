Feature: Clicking on "Cart" from Home page.
#Scenario: I should be able to click on cart and navigate to checkout page
#Given Initialize browser with chrome
#And Navigate to "urllink" site
#When i click on cart tab
#Then i navigate to checkout page

Scenario: User should be able to delete the item form checkout page
Given Initialize browser with chrome
And Navigate to "urllink" site
And click on Women tab
And user select an item at position 0 clicks on Add to cart tab
And i click on cart tab
When i click on image icon
Then i should be able to navigate to url