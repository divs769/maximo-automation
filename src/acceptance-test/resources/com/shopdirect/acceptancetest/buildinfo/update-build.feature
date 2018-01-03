Feature: Finish build

  Background:
    Given the database has been initialised and is running
    And build data has been inserted

  Scenario: The put request updates the existing build information to 'finished'
    Given a valid payload
    And a record in the database exists with the ID contained in the payload
    When the put endpoint is called
    Then the response is success
    And the build info record is updated in the database
