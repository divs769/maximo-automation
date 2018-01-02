Feature: Start build

  Background:
    Given the database has been initialised and is running

  Scenario: The Post operation creates a build information record in the database
    Given a valid payload
    When the post endpoint is called
    Then the response is success
    And the response body contains a valid id
    And the build info record is created in the database