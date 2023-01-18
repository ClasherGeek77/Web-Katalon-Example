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
@product
Feature: add to cart and checkout
  

  @addToCart
  Scenario: as user i want to add to cart
    Given I have login
    When I click add to cart
    Then I see shopping cart badge

  @removeFromCart
  Scenario: as user i want to add to cart
    Given I have login
    When I click add to cart
    Then I see shopping cart badge
    When I click remove
    Then I not see shopping cart badge