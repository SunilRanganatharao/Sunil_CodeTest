Feature: Verify the error message during user registartion with invalid email 

  @codetest
  Scenario Outline: Validate if user is able to see error message when he inputs invalid email id during registeration
   Given Automation practice application is opened
   When I click sign in
   When User Enter Email Id As "<EmailId>"
   Then System Validate with Error Message As "<Validation>"
   Examples: 
      | EmailId                    | Validation             |
      | sunil.rao@gmail     			 | Invalid email address. |
      |sunilkumarbabu@gmail.com    | An account using this email address has already been registered. Please enter a valid password or request a new one.|
      
    
    
      