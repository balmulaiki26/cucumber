Feature: When i go to amazon page, and search for an item,
  I expect to see some reference to that item in the result summary.

  Scenario: I want to be able to search on amazon
    Given I open the browser
    When I navigate to amazon page
    When I can see the amazon homepage
    Then I type 'java books' to search bar and clicked on search button
    And I validate search items has been displayed
    And I quit browser
