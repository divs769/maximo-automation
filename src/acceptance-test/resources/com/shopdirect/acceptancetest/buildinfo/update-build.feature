Feature: Finish build

  Background:
    Given the database has been initialised and is running
    And the database is clean
    And build data has been inserted

  Scenario: The put request sends the correct build information
    Given a valid update payload
    And a record in the database exists with the ID contained in the payload
    When the put endpoint is called
    Then the response is success
    And the build info record is updated in the database

  Scenario: The put request is sent and the ID is missing
    Given a payload with a missing ID
    When the put endpoint is called
    Then the response is failure

  Scenario: The put request is sent and the time is missing
    Given a payload with the time missing
    When the put endpoint is called
    Then the response is failure
    And the record is not updated in the database

  Scenario: The put request is sent and the time is invalid
    Given a payload with with an invalid time
    When the put endpoint is called
    Then the response is failure
    And the record is not updated in the database

  Scenario: The put request is sent and the finish time is before the start time
    Given a payload with a time before the start time
    When the put endpoint is called
    Then the response is failure
    And the record is not updated in the database

  Scenario: The put request is valid, but the ID doesn't exist
    Given a valid update payload with different ID
    And a record in the database doesn't exist with the ID contained in the payload
    When the put endpoint is called
    Then the response is failure