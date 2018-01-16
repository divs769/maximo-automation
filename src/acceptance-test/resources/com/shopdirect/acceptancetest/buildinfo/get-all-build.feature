Feature: Get all builds

  Background:
    Given the database has been initialised and is running
    And the database is clean
    And multiple build data records have been inserted

  Scenario: The database is empty
    Given the database is clean
    And a payload with no parameters
    When the get all endpoint is called
    Then the response is success
    And an empty list is returned

  Scenario: The request has no parameters
    Given a payload with no parameters
    When the get all endpoint is called
    Then the response is success
    And all of the builds are returned

  Scenario: The request has startIndex parameter
    Given a payload with a startIndex parameter
    When the get all endpoint is called
    Then the response is success
    And all of the builds, starting from startIndex, are returned

  Scenario: The startIndex is greater than the number of records
    Given a payload with a startIndex greater than the number of stored records
    When the get all endpoint is called
    Then the response is success
    And an empty list is returned

  Scenario: The request has limit parameter
    Given a payload with a limit parameter
    When the get all endpoint is called
    Then the response is success
    And all of the builds, up the limit, is returned

  Scenario: The request has limit paramter, but there are not enough records
    Given a payload with a limit parameter greater than the number of records
    When the get all endpoint is called
    Then the response is success
    And all of the builds are returned

  Scenario: The request has startIndex and limit parameters
    Given a payload with a startIndex and limit parameters
    When the get all endpoint is called
    Then the response is success
    And a list is returned, with records starting from startIndex and ending at limit

  Scenario: The request has startIndex and limit parameters, but there are not enough records
    Given a payload with a startIndex and limit that is higher than the number of records
    When the get all endpoint is called
    Then the response is success
    And a list is returned, with records starting from startIndex and ending at the last record
