#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@loginFeature
Feature: Title of your feature

  @sucessLogin
  Scenario Outline: as user i want to login
    Given I open saucedemo page
    When I type <email> and <password>
    And I click login
    Then I see product
    
    Examples: 
      | email  | password |
      | standard_user |secret_sauce |
  @failedLogin    
  Scenario Outline: as user i want to see error login
    Given I open saucedemo page
    When I type <email> and <password>
    And I click login
    Then I see invalidLogin
    
    Examples: 
      | email  | password |
      | standard_user1 |secret_sauce1 |
  @logout  
  Scenario: as user i want to logout
    Given I have login
    When I click home
    And I click logout
    Then I see uservalidTitle
      
      