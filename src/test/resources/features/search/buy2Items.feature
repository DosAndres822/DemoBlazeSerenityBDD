Feature: Buy two items into Demo Blaze
  
  Scenario: Buy two items into Demo Blaze
    Given user opens Blaze page
    When user adds two item to cart
    And user goes to Cart and confirm order
    Then user completes the purchase



