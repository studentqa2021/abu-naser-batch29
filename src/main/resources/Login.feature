@SmokeTest
Feature: Login function Test
@tc_123
Scenario: As a Luma application user, must do successful login with valid credential.
Given Open any browser
And go to application URL
When click sign in button
And put email
And put password
And click second sign in button
Then validate ;ogin was successful