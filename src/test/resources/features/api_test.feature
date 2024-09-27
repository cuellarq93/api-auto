Feature: Pruebas de API

  Scenario: Verificar la respuesta de una API
    Given I set the API endpoint
    When I send a GET request to the endpoint
    Then I should receive a 200 status code
    And the response body should contain "message" with "Hello, World!"
