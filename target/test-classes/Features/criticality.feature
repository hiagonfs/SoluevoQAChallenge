@criticality
Feature: Justifying a criticality
  Selecting a critical bug level, the screen presents different options depending on the selected type
  
  Background:
   	Given I access the tool 
    When I fill in the requesters name
    And I fill in the email
    And I select the 'Top Priority' criticality

  @criticality_toppriority_field_blank
  Scenario: Choosing the critical level: Top Priority with all required fields filled in
    And leave the reason field blank
    And I fill in what is the bug
    And I click submit 
    Then must not be submitted
    
  @toppriority
  Scenario: Choosing the critical level: Top Priority with all required fields filled in
    And I select the 'Medium Priority' criticality
    And I fill in what is the bug
    And I click submit 
    Then It must be successfully submitted