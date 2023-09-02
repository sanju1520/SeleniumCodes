
Feature: check the Search functionality on MagicBricks

  Scenario Outline: Validate search box 
    Given user is on home page
    When User enter <location>,<flat> & <budget>
    And click on search button
    Then It should display result page

    Examples: 
      |location|flat|budget|
      |Mumbai|1BHK|6000|
      |Pune|flat|25Lakh|
