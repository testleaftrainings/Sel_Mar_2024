Feature: Login functionality of Leaftaps application

#Background:
#Given Launch the browser
#And Load the url

Scenario: Login with positive credentials and verify 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then HomePage should be displayed


Scenario: Login with negative credentials and verify
Given Enter the username as 'Dem'
And Enter the password as 'crms'
When Click on the Login Button
But ErrorMessage should be displayed
