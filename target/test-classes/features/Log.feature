
@login    
Feature: validate Login Functionality for swag labs Application

Background:
Given user is on the login page of Swag Lab

@log1
Scenario: Check the login functionality for valid data
When User enter uname & password
And User clicks on login button
Then Login should be successful   

@log2
Scenario: Check the login functionality for invalid data
When User enter invalid uname & password
And User clicks on login button
Then Error message should display     












































    
#Feature: Validate creation of My Profile functionality on RedBus
#
  #Scenario: Validating Your name field with valid input 
    #Given: User should launch RedBus website
    #When:  Enter valid Name
#		And:	 User should be on Home Page
#		And:	 User should open My Account
#		And:	 User should be in dropdown menu of My Account
#		And:   User should click on 'My Profile'
#	  And:	 User should be on My Profile Page
    #Then:  valid name should be accept
    
 #@tag2
  #Scenario: Validating Your Name field with invalid input
    #Given: User should launch RedBus website (https://www.redbus.in/)
#		And:	 User should be on Home Page
#		And:   User should be logged in
#		And:	 User should open My Account
#		And:	 User should be in dropdown menu of My Account
#		And:   User should click on 'My Profile'
#	  And:	 User should be on My Profile Page
    #When:  Enter Invalid Name
    #Then:  It should give an error message of 'enter valid name'
    #
#Feature: Validate My Trips functionality on RedBus
#
 #@tag1
  #Scenario:  Validating Upcoming Trip option
    #Given: User should launch RedBus website (https://www.redbus.in/)
#		And:	 User should be on Home Page
#		And:   User should be logged in
#		And:	 User should open My Account
#		And:	 User should be in dropdown menu of My Account
#		And:   User should click on 'My Trip'
#	  And:	 User should be on My Trip Page
    #When:  click on Upcoming button
    #Then:  It should display details of upcoming trip.
    #
 #@tag2
  #Scenario:  Validating Completed Trip option
    #Given: User should launch RedBus website (https://www.redbus.in/)
#		And:	 User should be on Home Page
#		And:   User should be logged in
#		And:	 User should open My Account
#		And:	 User should be in dropdown menu of My Account
#		And:   User should click on 'My Trip'
#	  And:	 User should be on My Trip Page
    #When:  click on Completed button
    #Then:  It should display details of completed trip

  