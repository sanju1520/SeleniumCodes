   
Feature: Validate creation of My Profile functionality on RedBus

  Scenario: Validating Your name field with valid input 
    Given User should launch RedBus website
		And User should be on Home Page
		And User should open My Account
		And User should be in dropdown menu of My Account
		And User should click on My Profile
	  And User should be on My Profile Page
    When Enter valid Name
    Then valid name should be accept   
      
      
   
