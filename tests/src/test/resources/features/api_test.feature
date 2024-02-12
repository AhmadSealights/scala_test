Feature: API Testing

  Scenario: Request to the main endpoint should return status 200
    Given The API server is running
    When I request "http://localhost:8080"
    Then The response status should be 200

  Scenario: Request to the non-existing endpoint should return an error
    Given The API server is running
    When I request "http://localhost:8080/non"
    Then The response should be an error
