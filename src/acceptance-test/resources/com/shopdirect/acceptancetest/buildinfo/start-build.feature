Feature: Start build

  Background:
    Given the database has been initialised and is running
    And the database is clean

  Scenario: The Post operation sends complete data
    Given a valid payload, containing the build info
    When the post endpoint is called
    Then the response is success
    And the response body contains a valid id
    And the build info record is created in the database

  Scenario: The Post operation sends data with the build ID missing
    Given a payload missing the build ID
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data with the URL missing
    Given a payload missing the build URL
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data with time missing
    Given a payload missing the time
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data an invalid date or time
    Given a payload with with an invalid date or time
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data a URL with the jobs domain missing
    Given a payload with with an invalid URL "http://jenkins:8080/test/123"
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data a URL with an invalid build ID
    Given a payload with with an invalid URL "http://jenkins:8080/jobs/test/1ab"
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data a URL with no build ID
    Given a payload with with an invalid URL "http://jenkins:8080/jobs/test/"
    When the post endpoint is called
    Then the response is failure

  Scenario: The Post operation sends data a URL with no domain
    Given a payload with with an invalid URL "jobs/test/123"
    When the post endpoint is called
    Then the response is failure