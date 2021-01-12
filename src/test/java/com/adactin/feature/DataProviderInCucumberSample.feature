Feature: checking the login funcnality of the Adactin website 

@Smoke 
Scenario: checking with the corect login detials 
#  --->-   (simple data driven = this is used when you have the one single username and the password)
	Given the application is opened 
	When  the user on the loginpage 
	Then the user enters the "LokeshKaran" and "Lokeshkaran27.." 
	And the user clicks on login button 
	Then user goes to homepage and validates and closes the browser 
	
Scenario Outline: checking the login with the different username and password 
#	----> (with Example and scenario outline = used when you have mulltiple values to pass)
	Given the application is opened 
	When  the user on the loginpage 
	Then the user enters the incorrect "<username>" and correct "<password>" 
	And the user clicks on login button 
	Then the user is still on the login page as the username is wrong 
	
	Examples: 
		|username|password|
		|lok	|JEFN	|
		|TIM	|IEFNF	|
		|CHARLIE|dengoo|
		
Scenario: checking the login feature of the login page using list 
#	------>( using the table with list = used for the single username and the password and by using the list<List<>>)
	Given the application is opened 
	When  the user on the loginpage 
	Then the user enters the valid and invalid user detials with list 
		|Lokeshkaran|Lokeshkaran27..|
	And the user clicks on login button 
	Then user goes to homepage and validates and closes the browser 
	
	
Scenario: checking the login feature of the login page using map 
#	------>( using the table with map= used for the single username and the password and by using the Map<String,String>, but we have to complete all the test data in the same then)
	Given the application is opened 
	When  the user on the loginpage 
	Then the user enters the valid and invalid user detials with map 
		|username|password|
		|Lokeshkaran|Lokeshkaran27..|
		|tom@123|tom@455|
		|bosskaran|Master@123|
	And the user clicks on login button 
	Then user goes to homepage and validates and closes the browser 
	
	
	
