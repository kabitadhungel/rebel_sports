Feature: Adding item to the shopping cart
As a user, I want to add an item to the shopping cart for product purchase.

  @macpac
  Scenario: User can successfully add macpac's womens item to the cart
    Given User is on the homepage
    When User navigates to Brands 
    And User clicks macpac
  	And User clicks womens category
  	And User selects the item from displayed list
    When User selects the size eight
    And User click Add to Cart 
    Then Item will be successfully added to cart