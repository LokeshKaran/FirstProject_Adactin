Feature: Checking the hotel booking funcnality of the hotel 

Scenario: Booking the hotel in NewYork for two Members 
	Given  the application is opened with the chrome browser 
	When the user is in hotel search page 
	Then the user selects the location 
	And the user selects the hotel and Room type 
	And the user chooses the no of rooms and the check in and check out date 
	And the user selects the adults and the child in the room 
	And user clicks on the search button 
	Then the user is on confirmation page
	
