@INSTAGRAM
Feature: Signup as a new Instagram user
  

  @tag1
  Scenario: Create new Instagram account
    Given Open the browser 
    And Enter the Instagram Signup url
    When User enters Mobile Number or Email, Enters Full Name, Enters Username, Enters Password
    And Clicks the Sign up button
    Then User Selects Birth Month, Date and year
    And User clicks Next button

