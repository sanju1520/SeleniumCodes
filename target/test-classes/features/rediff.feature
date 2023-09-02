
Feature: create account functionality

  Scenario: validate create account form
    Given user is on create account page
    When user takes full_name , mailId , password , repassword , alternateMailId , mobileNo from excel sheet
    And click on create my account button
    Then The message box should display


















#Feature: create account functionality
#
  #Scenario: validate create account form
    #Given user is on create account page
    #When user enters full_name , mailId , password , repassword , alternateMailId , mobileNo
    #|Sanjana Tate|sanjana@gmail.com|sanjana123|sanjana123|sanjana123@gmail.com|9876543210|   
    #And click on create my account button
    #Then The message box should display

#Feature: check the Search functionality
#
  #Scenario Outline: validate search button
    #Given user is on home page
    #When user enters <keyword> in search bar
    #And click on search icon
    #Then info about keyword should display
#
#Examples:
#|keyword|
#|Manipur|
#|chess|    

#Feature: check the Search functionality
#
  #Scenario: validate search button
    #Given user is on home page
    #When user enters keyword in search bar
    #|Manipur|
    #|chess| 
    #And click on search icon
    #Then info about keyword should display
    
    


  