Feature: SearchHotel

Scenario Outline: user is able to search hotel
Given User is on the guidewirepage
Given User is Logging in Guidewire HomePage with values present  in Login pagesheet "<SheetName>" and "<Userid>"
Given User is on the SearchHotelPage
Given User is enterting values and click on search
Then validating search results
Then exit the browser

Examples:
|SheetName|Userid|
|Login|vasuvespag|
