$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/HomePage.feature");
formatter.feature({
  "name": "Clicking on Tabs on Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to click on \"cotton\" checkbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@runThis"
    }
  ]
});
formatter.step({
  "name": "Initialize browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "WomenTabSteps.initialize_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"urllink\" site",
  "keyword": "And "
});
formatter.match({
  "location": "WomenTabSteps.navigate_to_something_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Women tab",
  "keyword": "And "
});
formatter.match({
  "location": "WomenTabSteps.click_on_women_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"cotton\" compositions checkbox",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_something_compositions_checkbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click on cotton checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_should_be_able_to_click_on_cotton_checkbox()"
});
formatter.result({
  "status": "passed"
});
});