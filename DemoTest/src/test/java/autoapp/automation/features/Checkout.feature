Feature: Verify if the user is able to select an item, addo to cart and 
@codetest
  Scenario: Validate if user is able to select an item and add to cart and change color and quantity.
   Given Automation practice application is opened
   When I hover on megamenu dresses and select summer dresses
   Then summer dresses page is loaded
   When I select a dress quickview option
   Then I select blue color for the item and click on add to cart
   Then I validate the color and quantity of the item added in the final checkout page
  
    
      