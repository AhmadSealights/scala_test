Feature: API Testing

  Scenario: Request to the main endpoint should return status 200
    Given The API server is running
    When I request "http://localhost:8080"
    Then The response status should be 200

  Scenario: Request to the non-existing endpoint should return an error
    Given The API server is running
    When I request "http://localhost:8080/non"
    Then The response should be an error

  Scenario: Request to the string should be a greeting
    Given The API server is running
    When I request "http://localhost:8080/s/dude"
    Then The second response status should be "dude"
  
  Scenario: Two layer function should return
    Given The API server is running
    When I request "http://localhost:8080/twolayer?s=dude"
    Then Two layer call "dude"
  
  Scenario: Case class test
    Given The API server is running
    When I request "http://localhost:8080/caseclass?name=Alice&age=25"
    Then The response should be "name: Alice, age: 25"