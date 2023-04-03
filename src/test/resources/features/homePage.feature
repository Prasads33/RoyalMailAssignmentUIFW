Feature: Home Page
 As a user want to automate the process of searching for a particular product on an e-commerce website.

  Background:
    Given when user launch the shopping application


  @UserStory1
  Scenario Outline:   Validate User should able to select product categories

    When Application is launched then user should able to search the "<Product>" in the search bar
    Then click on search button
    Then User should able to verify first result contains the text of "<Product>"

    Examples:
      | Product |
      | iPhone  |
      | SAMSUNG |
