Feature: Start build

  Background:
    Given the database has been initialised and is running
    And the database is clean
    And Maximo is up and running

  Scenario: The Post operation sends complete data
    Given a valid payload containing the build info
    When the post endpoint is called
    Then the response is success
    And the response body contains a valid ID
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

  Scenario Outline: The Post payload contains invalid URL
    Given a payload with an invalid URL "<url>"
    When the post endpoint is called
    Then the response is failure
    Examples:
      | url                                     |
      | http://jenkins:8080/test/123            |
      | http://jenkins:8080/jobs/test/123       |
      | http://jenkins:8080/job/test/1ab        |
      | http://jenkins:8080/job/test/           |
      | http://1234.123.19.22:8080/job/test/123 |
      | jobs/test/123                           |

  Scenario: The post operation sends data with tag missing
    Given a payload missing the tag
    When the post endpoint is called
    Then the response is failure

  Scenario: The post operation sends data with description missing
    Given a payload missing the description
    When the post endpoint is called
    Then the response is failure