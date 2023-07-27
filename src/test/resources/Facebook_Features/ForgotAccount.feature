Feature: Forgot Account

Scenario: User find forgot account by registered number
Given user on login page
When user navigates to find account page
And enter registered number
And user click on search button
Then user ID should be displayed
