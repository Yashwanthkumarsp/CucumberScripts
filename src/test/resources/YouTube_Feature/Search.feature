Feature: Search Video

Scenario: User search video by entering video name in search text field
Given user on home page
When user enter <name> in search field
And user click on search icon
Then Video should be displayed

Examples:
|name               |
|API Testing        |
|Cucumber BDD       |
|Data Driven Testing|