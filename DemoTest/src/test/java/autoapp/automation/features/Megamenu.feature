Feature: Verify if the mega menu of Dresses works and if summer dresses can be selected

@codetest
  Scenario: Validate if user is able to hover on mega menu of dresses and select summer dresses
   Given Automation practice application is opened
   When I hover on megamenu dresses and select summer dresses
   Then summer dresses page is loaded
  
    
      