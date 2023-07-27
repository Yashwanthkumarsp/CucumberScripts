Feature: Login

Scenario: Login to facebook with valid credential
Given user on login page
When user enter valid UN
And user enter valid password
And click on login button
Then home page is displayed