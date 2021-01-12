Feature: checking the login funcnality of the Adactin website 

@Smoke 
Scenario: checking with the corect login detials 
	Given the application is opened 
	When  the user on the loginpage 
	Then the user enters the "LokeshKaran" and "Lokeshkaran27.." 
	And the user clicks on login button 
	Then user goes to homepage and validates 
	
Scenario: Booking the hotel in NewYork for two Members 
	Then the user selects the location 
	And the user selects the hotel and Room type 
	And the user chooses the no of rooms and the check in and check out date 
	And the user selects the adults and the child in the room 
	And user clicks on the search button 
	Then the user is on confirmation page 
	
Scenario: Conforming the hotel search page 
	When the user is the confirmation page 
	Then the user selects the selected hotel 
	And the users clicks on the continue button 
	Then the user is on the HotelUserDetailsPage 
	
Scenario: Entering the user details on HotelSeachPage 
	Then the user enters the first and last name 
	And enters the billing address and cardNo and cardtype 
	And theuser enters the expiry date and cvv number 
	And click on the Booknow button 
	Then the user is on HotelFinalPage 
	
Scenario: the Hotel is booked and checking the order No 
	Then the user gets the Order Number 
	And the users Log out of the Application 
	
	
