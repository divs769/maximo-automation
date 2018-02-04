Feature: Get all builds

  Background:
    Given the database has been initialised and is running
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

  Scenario: The request has pageIndex parameter
    Given a payload with a pageIndex parameter
    When the get all endpoint is called
    Then the response is failure

  Scenario: The request has pageSize parameter
    Given a payload with a pageSize parameter
    When the get all endpoint is called
    Then the response is success
    And the first page of builds with pageSize amount of entries is returned

  Scenario: The request has pageSize parameter, but there are less records than pageSize
    Given a payload with a pageSize parameter greater than the number of records
    When the get all endpoint is called
    Then the response is success
    And all of the builds are returned

  Scenario: The request has pageIndex and pageSize parameters
    Given a payload with a pageIndex and pageSize parameters
    When the get all endpoint is called
    Then the response is success
    And the specified page of builds is returned with the requested size

  Scenario: The request has pageIndex and pageSize parameters, but there are not enough records
    Given a payload with a pageIndex and pageSize that is higher than the number of records available
    When the get all endpoint is called
    Then the response is success
    And a page of builds is returned, starting from pageIndex and ending at the last record
