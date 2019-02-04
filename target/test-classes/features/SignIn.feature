Feature: Clicking on create Signin page

Scenario: User should be able to create an account after giving vaild mail id
Given Initialize browser with chrome
And Navigate to "urllink" site
When User clicks on Signin tab
Then User should be able to navigate to signin page

Scenario: email text filed should accept valid mail id
Given Initialize browser with chrome
And Navigate to "urllink" site
And User clicks on Signin
When user enters valid mail id "rasal@gmail.com"
Then User shold be able to navigate to signin site

Scenario: email text filed should accept valid mail id
Given Initialize browser with chrome
And Navigate to "urllink" site
And User clicks on Signin
When user enters invalid mail id "saoshih"
Then It should give an error message as invalid email address

Scenario: User should enter email id
Given Initialize browser with chrome
And Navigate to "urllink" site
And User clicks on Signin
When user enters "<id>" and clicks on creat account tab
  |id|
  |rasal@gmail.com|
Then user shold be able to navigate to site for valid mail id

Scenario: User should be able to upload file
Given Initialize browser with chrome
And Navigate to "urllink" site
And User clicks on ContactUs tab
When user clicks on choose file and clicks on send
Then user should be able to send uploaded file