Feature: Create Lead functionality of Leaftaps application

#Background:
#Given Launch the browser
#And Load the url

Scenario Outline: Create Lead with multiple data and verify the leadid 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then HomePage should be displayed
When Click on crmsfa link
And Click on the leads link
And Click on the createLead link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on the submit button
Then Leadid should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qeagle|Vidhya|R|