package autoapp.automation.stepDef;


import autoapp.automation.pages.MegamenuPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MegamenuStepDef 
{

    @When("^I hover on megamenu dresses and select summer dresses$")
    public void i_hover_on_dresses_and_select_summerdresses() throws Throwable 
    {
        MegamenuPage.clickSummerDresses();
       
    }
    
    @Then("^summer dresses page is loaded$")
    public void i_see_summer_dresses_page() throws Throwable 
    {
        MegamenuPage.verify_SummerDressesPage("Summer Dresses - My Store");
       
    }
    
    
}
