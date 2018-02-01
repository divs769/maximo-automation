Feature: Get a build

  Background:
    Given the database has been initialised and is running
    And some build data has been inserted

  Scenario: The request is valid
    Given a payload with a buildId
    When the get endpoint is called
    Then the response is success
    And the build data is returned

  Scenario: The build doesn't exist in the database
    Given a payload with a build ID that doesn't exist
    When the get endpoint is called
    Then the response is failure