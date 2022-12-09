Feature: Creating Account

Scenario Outline: user is logged in
Given User is on the guidewirepage
Given User is Logging in Guidewire HomePage with values present  in Login pagesheet "<SheetName>" and "<Userid>"
Then exit the browser

Examples:
|SheetName|Userid|
|Login|vasuvespag|
|Login|vasuvespag1|

Scenario Outline: Validating the login screen
Given User is on the guidewirepage
Given User is Logging in Guidewire HomePage with values present  in Login pagesheet "<SheetName>" and "<Userid>"
Given Validating the screen with userid

Examples:
|SheetName|Userid|
|Login|vasuvespag|
|Login|vasuvespag1|