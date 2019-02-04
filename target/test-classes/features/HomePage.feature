Feature: Clicking on Tabs on Home Page 

@runThis
Scenario: User should be able to click on "cotton" checkbox
Given Initialize browser with chrome 
And Navigate to "urllink" site
And click on Women tab
When user clicks on "cotton" compositions checkbox
Then user should be able to click on cotton checkbox

Scenario: User should be able to click on "polyester" checkbox
Given Initialize browser with chrome
And Navigate to "urllink" site
And click on Women tab
When user clicks on "polyester" compositions checkbox
Then user should be able to click on polyester checkbox

 Scenario: User should be able to click on "viscose" checkbox
Given Initialize browser with chrome
And Navigate to "urllink" site
And click on Women tab
When user clicks on "viscose" compositions checkbox
Then user should be able to click on viscose compositions checkbox

Scenario: User should be able to navigate to "Facebook" page
Given Initialize browser with chrome
And Navigate to "urllink" site
When User clicks on "Facebook" link on follow us
Then User should be able to navigate to facebook in new window

Scenario: User should be able to move slider
Given Initialize browser with chrome
And Navigate to "urllink" site
And click on Women tab
When user sets the slider xcordinate to 40
Then expected price range should be "$49.30 - $53.00"

Scenario: User should be able to click on advertise links 
Given Initialize browser with chrome
And Navigate to "urllink" site
When User clicks on advertise link 1 
Then User should be able to navigate to advertise page
 
Scenario: User should be able to add to quantity by clicking on plus icon
Given Initialize browser with chrome
And Navigate to "urllink" site
When User clicks on image 1 and adds 2 items
Then User should be able to see added items

Scenario: User should be able to select the size by clicking on dropdown
Given Initialize browser with chrome
And Navigate to "urllink" site
When User clicks on image 2 and select 2 size form dropdown