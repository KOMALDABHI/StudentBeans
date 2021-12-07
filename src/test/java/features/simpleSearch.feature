Feature: Simple Search

  Scenario: As a user I want to search for a brand so that I can see if I can get a discount on that brand

    Given  i should be navigate to url "https://www.studentbeans.com/uk"
    Then   i should be navigate to home page
    When   i should be open the search bar
    And    i should be enter "Samsung"
    Then   i should be display a search listing for "Samsung"