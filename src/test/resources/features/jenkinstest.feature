Feature: Jenkins

  @Jenkins
  Scenario: Successful registration of a new user
    Given that I enter the conduit site
    When I get information from the page
    Then the information on the page contains the title "Conduit"

  @Smoke
  Scenario: Successful registration of a new user
    Given that I enter the conduit site
    When I get information from the page
    Then the information on the page contains the title "Conduit2"