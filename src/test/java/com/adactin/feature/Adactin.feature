Feature: Hotel Booking In Adactin Application


##single set of data
#Scenario:
#Given user Lanuch The Application
#When user Enter The "Kanimozhi22" In Username Field
#And user Enter The "Kani@2212@A" In Password Field
#Then user Click On The Login Button and It Navigates To The Search


##multiple set of data
@SmokeTest
Scenario Outline: Adactin Hotel Booking
Given user Lanuch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button and It Navigates To The Search

Examples:
     |Username|Password|
     |qwert|789456|
     |zxcv|456123|
     |Kanimozhi22|Kani@2212@A|
     #we can also add a column if we want(|Username|Password|ccv|Cardnum|)


@SanityTest
Scenario: User Search and Select The Room and Details In The Select Hotel Page
When user Select The Hotel
And user Select The Location 
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click On The Search Button and It Navigates To The Select

@SanityTest
Scenario: User Select The Hotel Which Is Suitable
When user Select The Hotel Name
Then user Click On The Continue Button and It Navigates To The Book A Hotel

@SanityTest
Scenario: User Fill Up The Details
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No. in Credit Card No. Field
And user Select The Credit Card Type
And user Select The Expiry Date In Select Month Field
And user Select The Expiry Date In Select Year Field
And user Enter The Ccv In Ccv Field
Then user Click On The Book Now Button and It Navigates To The Booking Confirmation

@SanityTest
Scenario: User Click On Itinerary
Then user Click On The My Itinerary and It Navigates To Logout Page

@RegressionTest
Scenario: User Logout After Booking
Then user Click On The Logout Page






