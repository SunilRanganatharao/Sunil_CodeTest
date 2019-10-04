package autoapp.automation.stepDef;


import autoapp.automation.pages.CheckoutPage;
import autoapp.automation.pages.MegamenuPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutStepDef 
{

    @When("^I select a dress quickview option$")
    public void i_click_on_quickview() throws Throwable 
    {
        CheckoutPage.clickquickview();
       
    }
    
   @Then("^I select blue color for the item and click on add to cart$")
   public void i_select_blue_click_addtocart() throws Throwable 
   {
       CheckoutPage.changecolor_addtocart();
      
   }
   
   @Then("^I validate the color and quantity of the item added in the final checkout page$")
   public void i_validate_color_quantity_of_item_added() throws Throwable 
   {
       CheckoutPage.validatecolor();
       CheckoutPage.validatequantity();
       
   }
   
  
    
}
