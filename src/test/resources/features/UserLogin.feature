Feature: Login function

#Scenario: Valid login
#Given User is on login page
#When User enter the credentials
#Then User should navigated to home page

#Scenario: Valid login
#Given User is on login page
#When User enter "tomsmith" the "SuperSecretPassword!"
#Then User should navigated to home page

#Scenario Outline: Valid login
#Given User is on login page
#When User enter "<username>" the "<password>"
#Then User should navigated to home page

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|
#|testuser2|welcome123|


Scenario: Valid login
Given User is on login page
When User enter the credentials
|username|password|
|tomsmith|SuperSecretPassword!|
Then User should navigated to home page